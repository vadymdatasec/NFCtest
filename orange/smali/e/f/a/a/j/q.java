public abstract class e.f.a.a.j.q {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Lcom/google/auto/value/AutoValue; */
} // .end annotation
/* # direct methods */
public e.f.a.a.j.q ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static e.f.a.a.j.p i ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* new-instance v0, Le/f/a/a/j/b; */
	 /* invoke-direct {v0}, Le/f/a/a/j/b;-><init>()V */
	 /* new-instance v1, Ljava/util/HashMap; */
	 /* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
	 (( e.f.a.a.j.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/a/j/b;->a(Ljava/util/Map;)Le/f/a/a/j/p;
} // .end method
/* # virtual methods */
public final java.lang.String a ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .line 1 */
	 (( e.f.a.a.j.q ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/a/j/q;->a()Ljava/util/Map;
	 /* check-cast p1, Ljava/lang/String; */
	 /* if-nez p1, :cond_0 */
	 final String p1 = ""; // const-string p1, ""
} // :cond_0
} // .end method
public abstract java.util.Map a ( ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end method
public final Integer b ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
(( e.f.a.a.j.q ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/a/j/q;->a()Ljava/util/Map;
/* check-cast p1, Ljava/lang/String; */
/* if-nez p1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 2 */
} // :cond_0
java.lang.Integer .valueOf ( p1 );
p1 = (( java.lang.Integer ) p1 ).intValue ( ); // invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I
} // :goto_0
} // .end method
public abstract java.lang.Integer b ( ) {
} // .end method
public final Long c ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
(( e.f.a.a.j.q ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/a/j/q;->a()Ljava/util/Map;
/* check-cast p1, Ljava/lang/String; */
/* if-nez p1, :cond_0 */
/* const-wide/16 v0, 0x0 */
/* .line 2 */
} // :cond_0
java.lang.Long .valueOf ( p1 );
(( java.lang.Long ) p1 ).longValue ( ); // invoke-virtual {p1}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
} // :goto_0
/* return-wide v0 */
} // .end method
public abstract e.f.a.a.j.o c ( ) {
} // .end method
public abstract Long d ( ) {
} // .end method
public final java.util.Map e ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
(( e.f.a.a.j.q ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/a/j/q;->a()Ljava/util/Map;
java.util.Collections .unmodifiableMap ( v0 );
} // .end method
public abstract java.lang.String f ( ) {
} // .end method
public abstract Long g ( ) {
} // .end method
public e.f.a.a.j.p h ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Le/f/a/a/j/b; */
/* invoke-direct {v0}, Le/f/a/a/j/b;-><init>()V */
/* .line 2 */
(( e.f.a.a.j.q ) p0 ).f ( ); // invoke-virtual {p0}, Le/f/a/a/j/q;->f()Ljava/lang/String;
(( e.f.a.a.j.b ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/a/j/b;->a(Ljava/lang/String;)Le/f/a/a/j/p;
/* .line 3 */
(( e.f.a.a.j.q ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/a/a/j/q;->b()Ljava/lang/Integer;
(( e.f.a.a.j.p ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/a/j/p;->a(Ljava/lang/Integer;)Le/f/a/a/j/p;
/* .line 4 */
(( e.f.a.a.j.q ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/a/j/q;->c()Le/f/a/a/j/o;
(( e.f.a.a.j.p ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/a/j/p;->a(Le/f/a/a/j/o;)Le/f/a/a/j/p;
/* .line 5 */
(( e.f.a.a.j.q ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/a/j/q;->d()J
/* move-result-wide v1 */
(( e.f.a.a.j.p ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/a/j/p;->a(J)Le/f/a/a/j/p;
/* .line 6 */
(( e.f.a.a.j.q ) p0 ).g ( ); // invoke-virtual {p0}, Le/f/a/a/j/q;->g()J
/* move-result-wide v1 */
(( e.f.a.a.j.p ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/a/a/j/p;->b(J)Le/f/a/a/j/p;
/* new-instance v1, Ljava/util/HashMap; */
/* .line 7 */
(( e.f.a.a.j.q ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/a/a/j/q;->a()Ljava/util/Map;
/* invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V */
(( e.f.a.a.j.p ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/a/a/j/p;->a(Ljava/util/Map;)Le/f/a/a/j/p;
} // .end method
