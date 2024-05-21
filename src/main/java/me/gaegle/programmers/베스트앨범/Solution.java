package me.gaegle.programmers.베스트앨범;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
	public int[] solution(String[] genres, int[] plays) {
		List<Integer> answer = new ArrayList();

		List<GenrePlay> genrePlays = new ArrayList<>();
		for (int i = 0; i < genres.length; i++) {
			String genre = genres[i];
			int play = plays[i];

			GenrePlay genrePlay = genrePlays.stream()
				.filter(item -> item.isSameGenre(genre))
				.findFirst()
				.orElseGet(() -> {
					GenrePlay newGenrePlay = new GenrePlay(genre);
					genrePlays.add(newGenrePlay);
					return newGenrePlay;
				});
			genrePlay.put(i, play);
		}
		genrePlays.sort(Comparator.comparing(GenrePlay::summaryPlay, Comparator.reverseOrder()));

		for (GenrePlay genrePlay : genrePlays) {
			answer.addAll(genrePlay.getTop2Index());
		}

		return answer.stream().mapToInt(i -> i).toArray();
	}

	class GenrePlay {
		private String genre;
		private Map<Integer, Integer> playIndexMap;

		GenrePlay(String genre) {
			this.genre = genre;
			this.playIndexMap = new HashMap();
		}

		boolean isSameGenre(String genre) {
			return this.genre.equals(genre);
		}

		void put(int index, int play) {
			this.playIndexMap.put(index, play);
		}

		Integer summaryPlay() {
			return playIndexMap.values().stream()
				.reduce(Integer::sum)
				.orElse(0);
		}

		List<Integer> getTop2Index() {
			return playIndexMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(2)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
		}

	}
}
