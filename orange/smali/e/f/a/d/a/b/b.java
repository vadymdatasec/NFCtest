public abstract class e.f.a.d.a.b.b {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.f.a.d.a.b.b ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static e.f.a.d.a.b.b a ( android.os.Bundle p0, java.lang.String p1, e.f.a.d.a.b.x0 p2, Object p3 ) {
		 /* .locals 17 */
		 /* move-object/from16 v0, p0 */
		 /* move-object/from16 v1, p1 */
		 final String v2 = "status"; // const-string v2, "status"
		 e.f.a.d.a.e.b0 .a ( v2,v1 );
		 v2 = 		 (( android.os.Bundle ) v0 ).getInt ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
		 v2 = 		 /* move-object/from16 v3, p3 */
		 final String v3 = "error_code"; // const-string v3, "error_code"
		 e.f.a.d.a.e.b0 .a ( v3,v1 );
		 v3 = 		 (( android.os.Bundle ) v0 ).getInt ( v3 ); // invoke-virtual {v0, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
		 final String v4 = "bytes_downloaded"; // const-string v4, "bytes_downloaded"
		 e.f.a.d.a.e.b0 .a ( v4,v1 );
		 (( android.os.Bundle ) v0 ).getLong ( v4 ); // invoke-virtual {v0, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
		 /* move-result-wide v4 */
		 final String v6 = "total_bytes_to_download"; // const-string v6, "total_bytes_to_download"
		 e.f.a.d.a.e.b0 .a ( v6,v1 );
		 (( android.os.Bundle ) v0 ).getLong ( v6 ); // invoke-virtual {v0, v6}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
		 /* move-result-wide v6 */
		 /* move-object/from16 v8, p2 */
		 (( e.f.a.d.a.b.x0 ) v8 ).b ( v1 ); // invoke-virtual {v8, v1}, Le/f/a/d/a/b/x0;->b(Ljava/lang/String;)D
		 /* move-result-wide v8 */
		 final String v10 = "pack_version"; // const-string v10, "pack_version"
		 e.f.a.d.a.e.b0 .a ( v10,v1 );
		 (( android.os.Bundle ) v0 ).getLong ( v10 ); // invoke-virtual {v0, v10}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
		 /* move-result-wide v10 */
		 final String v12 = "pack_base_version"; // const-string v12, "pack_base_version"
		 e.f.a.d.a.e.b0 .a ( v12,v1 );
		 (( android.os.Bundle ) v0 ).getLong ( v12 ); // invoke-virtual {v0, v12}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J
		 /* move-result-wide v12 */
		 int v0 = 1; // const/4 v0, 0x1
		 int v14 = 4; // const/4 v14, 0x4
		 /* if-ne v2, v14, :cond_0 */
		 /* const-wide/16 v14, 0x0 */
		 /* cmp-long v16, v12, v14 */
		 if ( v16 != null) { // if-eqz v16, :cond_0
			 /* cmp-long v14, v12, v10 */
			 if ( v14 != null) { // if-eqz v14, :cond_0
				 int v0 = 2; // const/4 v0, 0x2
				 int v10 = 2; // const/4 v10, 0x2
			 } // :cond_0
			 int v10 = 1; // const/4 v10, 0x1
		 } // :goto_0
		 /* move-object/from16 v0, p1 */
		 /* move v1, v2 */
		 /* move v2, v3 */
		 /* move-wide v3, v4 */
		 /* move-wide v5, v6 */
		 /* move-wide v7, v8 */
		 /* move v9, v10 */
		 /* invoke-static/range {v0 ..v9}, Le/f/a/d/a/b/b;->a(Ljava/lang/String;IIJJDI)Le/f/a/d/a/b/b; */
	 } // .end method
	 public static e.f.a.d.a.b.b a ( java.lang.String p0, Integer p1, Integer p2, Long p3, Long p4, Double p5, Integer p6 ) {
		 /* .locals 11 */
		 /* new-instance v10, Le/f/a/d/a/b/g0; */
		 /* const-wide/high16 v0, 0x4059000000000000L # 100.0 */
		 /* mul-double v0, v0, p7 */
		 java.lang.Math .rint ( v0,v1 );
		 /* move-result-wide v0 */
		 /* double-to-int v8, v0 */
		 /* move-object v0, v10 */
		 /* move-object v1, p0 */
		 /* move v2, p1 */
		 /* move v3, p2 */
		 /* move-wide v4, p3 */
		 /* move-wide/from16 v6, p5 */
		 /* move/from16 v9, p9 */
		 /* invoke-direct/range {v0 ..v9}, Le/f/a/d/a/b/g0;-><init>(Ljava/lang/String;IIJJII)V */
	 } // .end method
	 /* # virtual methods */
	 public abstract Integer a ( ) {
	 } // .end method
	 public abstract Long b ( ) {
	 } // .end method
	 public abstract Integer c ( ) {
	 } // .end method
	 public abstract java.lang.String d ( ) {
	 } // .end method
	 public abstract Integer e ( ) {
	 } // .end method
	 public abstract Long f ( ) {
	 } // .end method
	 public abstract Integer g ( ) {
	 } // .end method
