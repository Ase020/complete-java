sealed class SealedA permits SealedB, SealedC {}

sealed class SealedB extends SealedA permits SealedD{}

non-sealed class SealedC extends SealedA{}

final class SealedD extends SealedB{}


public class SealedClass {
    public static void main(String[] args){

    }
}
