public class inal extends i.h.c.l implements i.h.b.p {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Li/h/c/l;", */
	 /* "Li/h/b/p<", */
	 /* "Ljava/lang/CharSequence;", */
	 /* "Ljava/lang/Integer;", */
	 /* "Li/d<", */
	 /* "+", */
	 /* "Ljava/lang/Integer;", */
	 /* "+", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.util.List b; //synthetic
public final Boolean c; //synthetic
/* # direct methods */
public inal ( ) {
	 /* .locals 0 */
	 this.b = p1;
	 /* iput-boolean p2, p0, Li/l/o;->c:Z */
	 int p1 = 2; // const/4 p1, 0x2
	 /* invoke-direct {p0, p1}, Li/h/c/l;-><init>(I)V */
	 return;
} // .end method
/* # virtual methods */
public final i.d a ( java.lang.CharSequence p0, Integer p1 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/lang/CharSequence;", */
	 /* "I)", */
	 /* "Li/d<", */
	 /* "Ljava/lang/Integer;", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
final String v0 = "$receiver"; // const-string v0, "$receiver"
i.h.c.k .c ( p1,v0 );
/* .line 1 */
v0 = this.b;
/* iget-boolean v1, p0, Li/l/o;->c:Z */
int v2 = 0; // const/4 v2, 0x0
i.l.p .a ( p1,v0,p2,v1,v2 );
if ( p1 != null) { // if-eqz p1, :cond_0
	 (( i.d ) p1 ).c ( ); // invoke-virtual {p1}, Li/d;->c()Ljava/lang/Object;
	 (( i.d ) p1 ).d ( ); // invoke-virtual {p1}, Li/d;->d()Ljava/lang/Object;
	 /* check-cast p1, Ljava/lang/String; */
	 p1 = 	 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
	 java.lang.Integer .valueOf ( p1 );
	 i.e .a ( p2,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public java.lang.Object a ( java.lang.Object p0, java.lang.Object p1 ) { //bridge//synthethic
/* .locals 0 */
/* check-cast p1, Ljava/lang/CharSequence; */
/* check-cast p2, Ljava/lang/Number; */
p2 = (( java.lang.Number ) p2 ).intValue ( ); // invoke-virtual {p2}, Ljava/lang/Number;->intValue()I
(( i.l.o ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Li/l/o;->a(Ljava/lang/CharSequence;I)Li/d;
} // .end method
