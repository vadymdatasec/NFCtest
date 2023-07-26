public abstract class e.b.a.c0.o.c implements e.b.a.c0.o.h {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<T:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Le/b/a/c0/o/h<", */
	 /* "TT;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final Integer b;
public final Integer c;
public e.b.a.c0.d d;
/* # direct methods */
public e.b.a.c0.o.c ( ) {
	 /* .locals 1 */
	 /* const/high16 v0, -0x80000000 */
	 /* .line 1 */
	 /* invoke-direct {p0, v0, v0}, Le/b/a/c0/o/c;-><init>(II)V */
	 return;
} // .end method
public e.b.a.c0.o.c ( ) {
	 /* .locals 3 */
	 /* .line 2 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 3 */
	 v0 = 	 e.b.a.e0.t .b ( p1,p2 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 4 */
		 /* iput p1, p0, Le/b/a/c0/o/c;->b:I */
		 /* .line 5 */
		 /* iput p2, p0, Le/b/a/c0/o/c;->c:I */
		 return;
		 /* .line 6 */
	 } // :cond_0
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: "; // const-string v2, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String p1 = " and height: "; // const-string p1, " and height: "
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // .end method
/* # virtual methods */
public void a ( ) {
	 /* .locals 0 */
	 return;
} // .end method
public void a ( android.graphics.drawable.Drawable p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public final void a ( Object p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.d = p1;
	 return;
} // .end method
public final void a ( Object p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public void b ( ) {
	 /* .locals 0 */
	 return;
} // .end method
public void b ( android.graphics.drawable.Drawable p0 ) {
	 /* .locals 0 */
	 return;
} // .end method
public final void b ( Object p0 ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* iget v0, p0, Le/b/a/c0/o/c;->b:I */
	 /* iget v1, p0, Le/b/a/c0/o/c;->c:I */
	 return;
} // .end method
public final e.b.a.c0.d c ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 v0 = this.d;
} // .end method
public void onDestroy ( ) {
	 /* .locals 0 */
	 return;
} // .end method
