public abstract class e.f.a.b.c.p.d {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Boolean a ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 final String v0 = "com.google.android.gms"; // const-string v0, "com.google.android.gms"
		 /* .line 1 */
		 (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 try { // :try_start_0
			 e.f.a.b.c.q.b .b ( p0 );
			 (( e.f.a.b.c.q.a ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/a/b/c/q/a;->a(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
			 /* .line 3 */
			 /* iget p0, p0, Landroid/content/pm/ApplicationInfo;->flags:I */
			 /* :try_end_0 */
			 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* const/high16 p1, 0x200000 */
			 /* and-int/2addr p0, p1 */
			 if ( p0 != null) { // if-eqz p0, :cond_0
				 int p0 = 1; // const/4 p0, 0x1
				 /* :catch_0 */
			 } // :cond_0
		 } // .end method
