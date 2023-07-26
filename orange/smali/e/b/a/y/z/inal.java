public class inal implements android.graphics.ImageDecoder$OnHeaderDecodedListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final e.b.a.y.z.e.d0 a;
	 public final Integer b;
	 public final Integer c;
	 public final e.b.a.y.b d;
	 public final e.b.a.y.z.e.u e;
	 public final Boolean f;
	 public final e.b.a.y.s g;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 e.b.a.y.z.e.d0 .d ( );
		 this.a = v0;
		 /* .line 3 */
		 /* iput p1, p0, Le/b/a/y/z/b;->b:I */
		 /* .line 4 */
		 /* iput p2, p0, Le/b/a/y/z/b;->c:I */
		 /* .line 5 */
		 p1 = e.b.a.y.z.e.x.f;
		 (( e.b.a.y.r ) p3 ).a ( p1 ); // invoke-virtual {p3, p1}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
		 /* check-cast p1, Le/b/a/y/b; */
		 this.d = p1;
		 /* .line 6 */
		 p1 = e.b.a.y.z.e.u.f;
		 (( e.b.a.y.r ) p3 ).a ( p1 ); // invoke-virtual {p3, p1}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
		 /* check-cast p1, Le/b/a/y/z/e/u; */
		 this.e = p1;
		 /* .line 7 */
		 p1 = e.b.a.y.z.e.x.i;
		 /* .line 8 */
		 (( e.b.a.y.r ) p3 ).a ( p1 ); // invoke-virtual {p3, p1}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 p1 = e.b.a.y.z.e.x.i;
			 /* .line 9 */
			 (( e.b.a.y.r ) p3 ).a ( p1 ); // invoke-virtual {p3, p1}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
			 /* check-cast p1, Ljava/lang/Boolean; */
			 p1 = 			 (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
			 if ( p1 != null) { // if-eqz p1, :cond_0
				 int p1 = 1; // const/4 p1, 0x1
			 } // :cond_0
			 int p1 = 0; // const/4 p1, 0x0
		 } // :goto_0
		 /* iput-boolean p1, p0, Le/b/a/y/z/b;->f:Z */
		 /* .line 10 */
		 p1 = e.b.a.y.z.e.x.g;
		 (( e.b.a.y.r ) p3 ).a ( p1 ); // invoke-virtual {p3, p1}, Le/b/a/y/r;->a(Le/b/a/y/q;)Ljava/lang/Object;
		 /* check-cast p1, Le/b/a/y/s; */
		 this.g = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onHeaderDecoded ( android.graphics.ImageDecoder p0, android.graphics.ImageDecoder$ImageInfo p1, android.graphics.ImageDecoder$Source p2 ) {
		 /* .locals 8 */
		 /* .line 1 */
		 p3 = this.a;
		 /* iget v0, p0, Le/b/a/y/z/b;->b:I */
		 /* iget v1, p0, Le/b/a/y/z/b;->c:I */
		 /* iget-boolean v2, p0, Le/b/a/y/z/b;->f:Z */
		 int v3 = 0; // const/4 v3, 0x0
		 p3 = 		 (( e.b.a.y.z.e.d0 ) p3 ).a ( v0, v1, v2, v3 ); // invoke-virtual {p3, v0, v1, v2, v3}, Le/b/a/y/z/e/d0;->a(IIZZ)Z
		 int v0 = 1; // const/4 v0, 0x1
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 int p3 = 3; // const/4 p3, 0x3
			 /* .line 2 */
			 (( android.graphics.ImageDecoder ) p1 ).setAllocator ( p3 ); // invoke-virtual {p1, p3}, Landroid/graphics/ImageDecoder;->setAllocator(I)V
			 /* .line 3 */
		 } // :cond_0
		 (( android.graphics.ImageDecoder ) p1 ).setAllocator ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/ImageDecoder;->setAllocator(I)V
		 /* .line 4 */
	 } // :goto_0
	 p3 = this.d;
	 v1 = e.b.a.y.b.c;
	 /* if-ne p3, v1, :cond_1 */
	 /* .line 5 */
	 (( android.graphics.ImageDecoder ) p1 ).setMemorySizePolicy ( v3 ); // invoke-virtual {p1, v3}, Landroid/graphics/ImageDecoder;->setMemorySizePolicy(I)V
	 /* .line 6 */
} // :cond_1
/* new-instance p3, Le/b/a/y/z/a; */
/* invoke-direct {p3, p0}, Le/b/a/y/z/a;-><init>(Le/b/a/y/z/b;)V */
(( android.graphics.ImageDecoder ) p1 ).setOnPartialImageListener ( p3 ); // invoke-virtual {p1, p3}, Landroid/graphics/ImageDecoder;->setOnPartialImageListener(Landroid/graphics/ImageDecoder$OnPartialImageListener;)V
/* .line 7 */
(( android.graphics.ImageDecoder$ImageInfo ) p2 ).getSize ( ); // invoke-virtual {p2}, Landroid/graphics/ImageDecoder$ImageInfo;->getSize()Landroid/util/Size;
/* .line 8 */
/* iget v1, p0, Le/b/a/y/z/b;->b:I */
/* const/high16 v2, -0x80000000 */
/* if-ne v1, v2, :cond_2 */
/* .line 9 */
v1 = (( android.util.Size ) p3 ).getWidth ( ); // invoke-virtual {p3}, Landroid/util/Size;->getWidth()I
/* .line 10 */
} // :cond_2
/* iget v4, p0, Le/b/a/y/z/b;->c:I */
/* if-ne v4, v2, :cond_3 */
/* .line 11 */
v4 = (( android.util.Size ) p3 ).getHeight ( ); // invoke-virtual {p3}, Landroid/util/Size;->getHeight()I
/* .line 12 */
} // :cond_3
v2 = this.e;
/* .line 13 */
v5 = (( android.util.Size ) p3 ).getWidth ( ); // invoke-virtual {p3}, Landroid/util/Size;->getWidth()I
v6 = (( android.util.Size ) p3 ).getHeight ( ); // invoke-virtual {p3}, Landroid/util/Size;->getHeight()I
v1 = (( e.b.a.y.z.e.u ) v2 ).b ( v5, v6, v1, v4 ); // invoke-virtual {v2, v5, v6, v1, v4}, Le/b/a/y/z/e/u;->b(IIII)F
/* .line 14 */
v2 = (( android.util.Size ) p3 ).getWidth ( ); // invoke-virtual {p3}, Landroid/util/Size;->getWidth()I
/* int-to-float v2, v2 */
/* mul-float v2, v2, v1 */
v2 = java.lang.Math .round ( v2 );
/* .line 15 */
v4 = (( android.util.Size ) p3 ).getHeight ( ); // invoke-virtual {p3}, Landroid/util/Size;->getHeight()I
/* int-to-float v4, v4 */
/* mul-float v4, v4, v1 */
v4 = java.lang.Math .round ( v4 );
int v5 = 2; // const/4 v5, 0x2
final String v6 = "ImageDecoder"; // const-string v6, "ImageDecoder"
/* .line 16 */
v5 = android.util.Log .isLoggable ( v6,v5 );
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 17 */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Resizing from ["; // const-string v7, "Resizing from ["
(( java.lang.StringBuilder ) v5 ).append ( v7 ); // invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 18 */
v7 = (( android.util.Size ) p3 ).getWidth ( ); // invoke-virtual {p3}, Landroid/util/Size;->getWidth()I
(( java.lang.StringBuilder ) v5 ).append ( v7 ); // invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v7 = "x"; // const-string v7, "x"
(( java.lang.StringBuilder ) v5 ).append ( v7 ); // invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 19 */
p3 = (( android.util.Size ) p3 ).getHeight ( ); // invoke-virtual {p3}, Landroid/util/Size;->getHeight()I
(( java.lang.StringBuilder ) v5 ).append ( p3 ); // invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p3 = "] to ["; // const-string p3, "] to ["
(( java.lang.StringBuilder ) v5 ).append ( p3 ); // invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v2 ); // invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v7 ); // invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p3 = "] scaleFactor: "; // const-string p3, "] scaleFactor: "
(( java.lang.StringBuilder ) v5 ).append ( p3 ); // invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 20 */
android.util.Log .v ( v6,p3 );
/* .line 21 */
} // :cond_4
(( android.graphics.ImageDecoder ) p1 ).setTargetSize ( v2, v4 ); // invoke-virtual {p1, v2, v4}, Landroid/graphics/ImageDecoder;->setTargetSize(II)V
/* .line 22 */
p3 = this.g;
if ( p3 != null) { // if-eqz p3, :cond_8
/* .line 23 */
/* const/16 v2, 0x1c */
/* if-lt v1, v2, :cond_7 */
/* .line 24 */
v1 = e.b.a.y.s.c;
/* if-ne p3, v1, :cond_5 */
/* .line 25 */
(( android.graphics.ImageDecoder$ImageInfo ) p2 ).getColorSpace ( ); // invoke-virtual {p2}, Landroid/graphics/ImageDecoder$ImageInfo;->getColorSpace()Landroid/graphics/ColorSpace;
if ( p3 != null) { // if-eqz p3, :cond_5
/* .line 26 */
(( android.graphics.ImageDecoder$ImageInfo ) p2 ).getColorSpace ( ); // invoke-virtual {p2}, Landroid/graphics/ImageDecoder$ImageInfo;->getColorSpace()Landroid/graphics/ColorSpace;
p2 = (( android.graphics.ColorSpace ) p2 ).isWideGamut ( ); // invoke-virtual {p2}, Landroid/graphics/ColorSpace;->isWideGamut()Z
if ( p2 != null) { // if-eqz p2, :cond_5
	 int v3 = 1; // const/4 v3, 0x1
} // :cond_5
if ( v3 != null) { // if-eqz v3, :cond_6
	 /* .line 27 */
	 p2 = android.graphics.ColorSpace$Named.DISPLAY_P3;
} // :cond_6
p2 = android.graphics.ColorSpace$Named.SRGB;
} // :goto_1
android.graphics.ColorSpace .get ( p2 );
/* .line 28 */
(( android.graphics.ImageDecoder ) p1 ).setTargetColorSpace ( p2 ); // invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setTargetColorSpace(Landroid/graphics/ColorSpace;)V
} // :cond_7
/* const/16 p2, 0x1a */
/* if-lt v1, p2, :cond_8 */
/* .line 29 */
p2 = android.graphics.ColorSpace$Named.SRGB;
android.graphics.ColorSpace .get ( p2 );
(( android.graphics.ImageDecoder ) p1 ).setTargetColorSpace ( p2 ); // invoke-virtual {p1, p2}, Landroid/graphics/ImageDecoder;->setTargetColorSpace(Landroid/graphics/ColorSpace;)V
} // :cond_8
} // :goto_2
return;
} // .end method
