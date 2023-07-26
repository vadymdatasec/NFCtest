public class e.c.a.g2 extends e.c.a.j2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public Float a;
	 public Float b;
	 public android.graphics.Path c;
	 public final e.c.a.l2 d; //synthetic
	 /* # direct methods */
	 public e.c.a.g2 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 this.d = p1;
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* invoke-direct {p0, p1, v0}, Le/c/a/j2;-><init>(Le/c/a/l2;Le/c/a/j2;)V */
		 /* .line 3 */
		 /* iput p2, p0, Le/c/a/g2;->a:F */
		 /* .line 4 */
		 /* iput p3, p0, Le/c/a/g2;->b:F */
		 /* .line 5 */
		 this.c = p4;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( java.lang.String p0 ) {
		 /* .locals 8 */
		 /* .line 3 */
		 v0 = this.d;
		 v0 = 		 e.c.a.l2 .a ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 4 */
			 /* new-instance v0, Landroid/graphics/Path; */
			 /* invoke-direct {v0}, Landroid/graphics/Path;-><init>()V */
			 /* .line 5 */
			 v1 = this.d;
			 e.c.a.l2 .b ( v1 );
			 v1 = this.e;
			 int v3 = 0; // const/4 v3, 0x0
			 v4 = 			 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
			 /* iget v5, p0, Le/c/a/g2;->a:F */
			 /* iget v6, p0, Le/c/a/g2;->b:F */
			 /* move-object v2, p1 */
			 /* move-object v7, v0 */
			 /* invoke-virtual/range {v1 ..v7}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V */
			 /* .line 6 */
			 v1 = this.c;
			 (( android.graphics.Path ) v1 ).addPath ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V
			 /* .line 7 */
		 } // :cond_0
		 /* iget v0, p0, Le/c/a/g2;->a:F */
		 v1 = this.d;
		 e.c.a.l2 .b ( v1 );
		 v1 = this.e;
		 p1 = 		 (( android.graphics.Paint ) v1 ).measureText ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
		 /* add-float/2addr v0, p1 */
		 /* iput v0, p0, Le/c/a/g2;->a:F */
		 return;
	 } // .end method
	 public Boolean a ( e.c.a.s1 p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* instance-of p1, p1, Le/c/a/t1; */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 int p1 = 0; // const/4 p1, 0x0
			 /* new-array v0, p1, [Ljava/lang/Object; */
			 final String v1 = "Using <textPath> elements in a clip path is not supported."; // const-string v1, "Using <textPath> elements in a clip path is not supported."
			 /* .line 2 */
			 e.c.a.l2 .c ( v1,v0 );
		 } // :cond_0
		 int p1 = 1; // const/4 p1, 0x1
	 } // .end method
