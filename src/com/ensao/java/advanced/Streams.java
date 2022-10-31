package com.ensao.java.advanced;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
@SuppressWarnings("all")
public class Streams {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Eren", "Mikasa");
		Stream<String> namesAsStream = names.stream();
		
		String[] namesArray = {"Armin", "Reiner"};
		Stream<String> streamedNamesArray = Arrays.stream(namesArray);
		Stream<String> streamedNamesArrayByOf = Stream.of(namesArray);
		
		
		Stream<String> nullableValue = Stream.ofNullable("Something that could be null");
		
		
		Stream<Optional<String>> chacals = Stream.of(Optional.ofNullable("Chacal"));
		Stream<String> chacauxOuChacal = chacals.flatMap(Optional::stream);
		
		Optional<String> first = namesAsStream.findFirst();
		
		
		Set<String> set = namesAsStream.collect(Collectors.toSet());
		
		Stream<String> taken = namesAsStream.takeWhile(element -> !element.isEmpty());
		Stream<String> discarded = namesAsStream.dropWhile(element -> !element.isEmpty());
		
		List<String> strings = namesAsStream.toList();
		
		
		Optional<Integer> somme = Stream.of(1, 2, 3, 4, 5).reduce( (a, b) -> a + b);
		IntStream.range(0, 3).summaryStatistics();
		ToIntFunction<Integer> integerToIntFunction = y -> y;
		Stream.of(1,3).mapToInt(integerToIntFunction);
		
		
		
		
		
		
		
	}
}

