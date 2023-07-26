public class com.google.firebase.components.DependencyCycleException extends com.google.firebase.components.DependencyException {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.google.firebase.components.DependencyCycleException ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/List<", */
		 /* "Le/f/c/k/e<", */
		 /* "*>;>;)V" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "Dependency cycle detected: "; // const-string v1, "Dependency cycle detected: "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 java.util.Arrays .toString ( p1 );
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {p0, p1}, Lcom/google/firebase/components/DependencyException;-><init>(Ljava/lang/String;)V */
	 return;
} // .end method
