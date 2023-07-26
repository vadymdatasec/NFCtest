public abstract class e.f.b.b.s0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Boolean a ( java.util.Set p0, java.lang.Object p1 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/Set<", */
		 /* "*>;", */
		 /* "Ljava/lang/Object;", */
		 /* ")Z" */
		 /* } */
	 } // .end annotation
	 int v0 = 1; // const/4 v0, 0x1
	 /* if-ne p0, p1, :cond_0 */
	 /* .line 1 */
} // :cond_0
/* instance-of v1, p1, Ljava/util/Set; */
int v2 = 0; // const/4 v2, 0x0
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* .line 2 */
	 /* check-cast p1, Ljava/util/Set; */
	 /* .line 3 */
		 v3 = 		 v1 = 	 try { // :try_start_0
		 p0 = 		 /* if-ne v1, v3, :cond_1 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NullPointerException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
		 if ( p0 != null) { // if-eqz p0, :cond_1
		 } // :cond_1
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 /* :catch_0 */
} // :cond_2
} // .end method
