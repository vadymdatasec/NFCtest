public class e.b.a.c0.o.f {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public e.b.a.c0.o.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public e.b.a.c0.o.k a ( android.widget.ImageView p0, java.lang.Class p1 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<Z:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Landroid/widget/ImageView;", */
		 /* "Ljava/lang/Class<", */
		 /* "TZ;>;)", */
		 /* "Le/b/a/c0/o/k<", */
		 /* "Landroid/widget/ImageView;", */
		 /* "TZ;>;" */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* const-class v0, Landroid/graphics/Bitmap; */
	 v0 = 	 (( java.lang.Object ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 2 */
		 /* new-instance p2, Le/b/a/c0/o/b; */
		 /* invoke-direct {p2, p1}, Le/b/a/c0/o/b;-><init>(Landroid/widget/ImageView;)V */
		 /* .line 3 */
	 } // :cond_0
	 /* const-class v0, Landroid/graphics/drawable/Drawable; */
	 v0 = 	 (( java.lang.Class ) v0 ).isAssignableFrom ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 4 */
		 /* new-instance p2, Le/b/a/c0/o/d; */
		 /* invoke-direct {p2, p1}, Le/b/a/c0/o/d;-><init>(Landroid/widget/ImageView;)V */
		 /* .line 5 */
	 } // :cond_1
	 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "Unhandled class: "; // const-string v1, "Unhandled class: "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 final String p2 = ", try .as*(Class).transcode(ResourceTranscoder)"; // const-string p2, ", try .as*(Class).transcode(ResourceTranscoder)"
	 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw p1 */
} // .end method
