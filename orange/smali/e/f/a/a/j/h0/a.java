public abstract class e.f.a.a.j.h0.a {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static java.lang.String a ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "TransportRuntime."; // const-string v1, "TransportRuntime."
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
	 public static void a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 0 */
		 /* .line 4 */
		 e.f.a.a.j.h0.a .a ( p0 );
		 android.util.Log .i ( p0,p1 );
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0, java.lang.String p1, java.lang.Object p2 ) {
		 /* .locals 2 */
		 /* .line 2 */
		 e.f.a.a.j.h0.a .a ( p0 );
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p2, v0, v1 */
		 java.lang.String .format ( p1,v0 );
		 android.util.Log .d ( p0,p1 );
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0, java.lang.String p1, java.lang.Throwable p2 ) {
		 /* .locals 0 */
		 /* .line 5 */
		 e.f.a.a.j.h0.a .a ( p0 );
		 android.util.Log .e ( p0,p1,p2 );
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0, java.lang.String p1, java.lang.Object...p2 ) {
		 /* .locals 0 */
		 /* .line 3 */
		 e.f.a.a.j.h0.a .a ( p0 );
		 java.lang.String .format ( p1,p2 );
		 android.util.Log .d ( p0,p1 );
		 return;
	 } // .end method
	 public static void b ( java.lang.String p0, java.lang.String p1, java.lang.Object p2 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 e.f.a.a.j.h0.a .a ( p0 );
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput-object p2, v0, v1 */
		 java.lang.String .format ( p1,v0 );
		 android.util.Log .w ( p0,p1 );
		 return;
	 } // .end method
