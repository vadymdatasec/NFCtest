public class e.c.a.h2 implements java.lang.Cloneable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public e.c.a.y0 b;
	 public Boolean c;
	 public Boolean d;
	 public android.graphics.Paint e;
	 public android.graphics.Paint f;
	 public e.c.a.n g;
	 public e.c.a.n h;
	 public Boolean i;
	 public Boolean j;
	 /* # direct methods */
	 public e.c.a.h2 ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance p1, Landroid/graphics/Paint; */
		 /* invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V */
		 this.e = p1;
		 /* const/16 v0, 0x181 */
		 /* .line 3 */
		 (( android.graphics.Paint ) p1 ).setFlags ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFlags(I)V
		 /* .line 4 */
		 p1 = this.e;
		 v1 = android.graphics.Paint$Style.FILL;
		 (( android.graphics.Paint ) p1 ).setStyle ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 /* .line 5 */
		 p1 = this.e;
		 v1 = android.graphics.Typeface.DEFAULT;
		 (( android.graphics.Paint ) p1 ).setTypeface ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
		 /* .line 6 */
		 /* new-instance p1, Landroid/graphics/Paint; */
		 /* invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V */
		 this.f = p1;
		 /* .line 7 */
		 (( android.graphics.Paint ) p1 ).setFlags ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFlags(I)V
		 /* .line 8 */
		 p1 = this.f;
		 v0 = android.graphics.Paint$Style.STROKE;
		 (( android.graphics.Paint ) p1 ).setStyle ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 /* .line 9 */
		 p1 = this.f;
		 v0 = android.graphics.Typeface.DEFAULT;
		 (( android.graphics.Paint ) p1 ).setTypeface ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
		 /* .line 10 */
		 e.c.a.y0 .a ( );
		 this.b = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object clone ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 try { // :try_start_0
			 /* invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object; */
			 /* check-cast v0, Le/c/a/h2; */
			 /* .line 2 */
			 v1 = this.b;
			 (( e.c.a.y0 ) v1 ).clone ( ); // invoke-virtual {v1}, Le/c/a/y0;->clone()Ljava/lang/Object;
			 /* check-cast v1, Le/c/a/y0; */
			 this.b = v1;
			 /* .line 3 */
			 /* new-instance v1, Landroid/graphics/Paint; */
			 v2 = this.e;
			 /* invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V */
			 this.e = v1;
			 /* .line 4 */
			 /* new-instance v1, Landroid/graphics/Paint; */
			 v2 = this.f;
			 /* invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V */
			 this.f = v1;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 5 */
			 /* new-instance v1, Ljava/lang/InternalError; */
			 (( java.lang.CloneNotSupportedException ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/CloneNotSupportedException;->toString()Ljava/lang/String;
			 /* invoke-direct {v1, v0}, Ljava/lang/InternalError;-><init>(Ljava/lang/String;)V */
			 /* throw v1 */
		 } // .end method
