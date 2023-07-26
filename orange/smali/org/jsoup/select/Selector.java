public class org.jsoup.select.Selector {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/jsoup/select/Selector$SelectorParseException; */
	 /* } */
} // .end annotation
/* # instance fields */
public final m.b.k.q0 a;
public final m.b.i.l b;
/* # direct methods */
public org.jsoup.select.Selector ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 m.b.h.j .a ( p1 );
	 /* .line 3 */
	 (( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
	 /* .line 4 */
	 m.b.h.j .b ( p1 );
	 /* .line 5 */
	 m.b.h.j .a ( p2 );
	 /* .line 6 */
	 m.b.k.t0 .a ( p1 );
	 this.a = p1;
	 /* .line 7 */
	 this.b = p2;
	 return;
} // .end method
public static m.b.k.f a ( java.lang.String p0, Object p1 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* new-instance v0, Lorg/jsoup/select/Selector; */
	 /* invoke-direct {v0, p0, p1}, Lorg/jsoup/select/Selector;-><init>(Ljava/lang/String;Lm/b/i/l;)V */
	 (( org.jsoup.select.Selector ) v0 ).a ( ); // invoke-virtual {v0}, Lorg/jsoup/select/Selector;->a()Lm/b/k/f;
} // .end method
/* # virtual methods */
public final m.b.k.f a ( ) {
	 /* .locals 2 */
	 /* .line 2 */
	 v0 = this.a;
	 v1 = this.b;
	 m.b.k.b .a ( v0,v1 );
} // .end method
