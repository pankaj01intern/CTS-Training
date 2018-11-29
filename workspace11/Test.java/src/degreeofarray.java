import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class degreeofarray {
	 static int degreeOfArray(int[] arr){
	int max = 0;
	Map<Integer, Integer> map = new HashMap<>();
	Map<Integer, Integer> startIndex = new HashMap<>();
	Map<Integer, Integer> endIndex = new HashMap<>();
	for(int i = 0; i < arr.length; i++){
	   int value = arr[i];
	   if(map.containsKey(value)){
	      map.put(value, map.get(value) + 1);
	   }else{
	      startIndex.put(value, i);
	      map.put(value, 1);
	   }
	   endIndex.put(value, i);
	   max = Integer.max(max, map.get(value));//Calculate the degree of the array
	}
	int result = arr.length;
	for(int i : map.keySet()){
	   if(map.get(i) == max){
	      int len = endIndex.get(i) - startIndex.get(i) + 1;
	      result = Integer.min(result, len);
	   }
	}
	return result;
}

public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    final String fileName = System.getenv("OUTPUT_PATH");
    BufferedWriter bw = null;
    if (fileName != null) {
        bw = new BufferedWriter(new FileWriter(fileName));
    }
    else {
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    int res;
    int arr_size = 0;
    arr_size = Integer.parseInt(in.nextLine().trim());

    int[] arr = new int[arr_size];
    for(int i = 0; i < arr_size; i++) {
        int arr_item;
        arr_item = Integer.parseInt(in.nextLine().trim());
        arr[i] = arr_item;
    }

    res = degreeOfArray(arr);
    bw.write(String.valueOf(res));
    bw.newLine();

    bw.close();
}
}

