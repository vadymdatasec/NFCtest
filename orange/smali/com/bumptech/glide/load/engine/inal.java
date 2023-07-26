public class inal implements java.lang.Appendable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/bumptech/glide/load/engine/GlideException; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x19 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public final java.lang.Appendable b;
public Boolean c;
/* # direct methods */
public inal ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* .line 2 */
/* iput-boolean v0, p0, Lcom/bumptech/glide/load/engine/GlideException$a;->c:Z */
/* .line 3 */
this.b = p1;
return;
} // .end method
/* # virtual methods */
public final java.lang.CharSequence a ( java.lang.CharSequence p0 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
final String p1 = ""; // const-string p1, ""
} // :cond_0
} // .end method
public java.lang.Appendable append ( Object p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
/* iget-boolean v0, p0, Lcom/bumptech/glide/load/engine/GlideException$a;->c:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
/* iput-boolean v1, p0, Lcom/bumptech/glide/load/engine/GlideException$a;->c:Z */
/* .line 3 */
v0 = this.b;
final String v2 = " "; // const-string v2, " "
} // :cond_0
/* const/16 v0, 0xa */
/* if-ne p1, v0, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
/* .line 4 */
} // :cond_1
/* iput-boolean v1, p0, Lcom/bumptech/glide/load/engine/GlideException$a;->c:Z */
/* .line 5 */
v0 = this.b;
} // .end method
public java.lang.Appendable append ( java.lang.CharSequence p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 6 */
(( com.bumptech.glide.load.engine.GlideException$a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/bumptech/glide/load/engine/GlideException$a;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
v0 = /* .line 7 */
int v1 = 0; // const/4 v1, 0x0
(( com.bumptech.glide.load.engine.GlideException$a ) p0 ).append ( p1, v1, v0 ); // invoke-virtual {p0, p1, v1, v0}, Lcom/bumptech/glide/load/engine/GlideException$a;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
} // .end method
public java.lang.Appendable append ( java.lang.CharSequence p0, Integer p1, Integer p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 8 */
(( com.bumptech.glide.load.engine.GlideException$a ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Lcom/bumptech/glide/load/engine/GlideException$a;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/* .line 9 */
/* iget-boolean v0, p0, Lcom/bumptech/glide/load/engine/GlideException$a;->c:Z */
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 10 */
/* iput-boolean v1, p0, Lcom/bumptech/glide/load/engine/GlideException$a;->c:Z */
/* .line 11 */
v0 = this.b;
final String v2 = " "; // const-string v2, " "
/* .line 12 */
v0 = } // :cond_0
/* if-lez v0, :cond_1 */
v0 = /* add-int/lit8 v0, p3, -0x1 */
/* const/16 v2, 0xa */
/* if-ne v0, v2, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
/* iput-boolean v1, p0, Lcom/bumptech/glide/load/engine/GlideException$a;->c:Z */
/* .line 13 */
v0 = this.b;
} // .end method
