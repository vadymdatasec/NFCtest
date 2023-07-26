public class e.f.b.a.f {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 /* # direct methods */
	 public e.f.b.a.f ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 e.f.b.a.p .a ( p1 );
		 /* check-cast p1, Ljava/lang/String; */
		 this.a = p1;
		 return;
	 } // .end method
	 public static e.f.b.a.f a ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/b/a/f; */
		 /* invoke-direct {v0, p0}, Le/f/b/a/f;-><init>(Ljava/lang/String;)V */
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Appendable a ( java.lang.Appendable p0, java.util.Iterator p1 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<A::", */
		 /* "Ljava/lang/Appendable;", */
		 /* ">(TA;", */
		 /* "Ljava/util/Iterator<", */
		 /* "+", */
		 /* "Ljava/lang/Object;", */
		 /* ">;)TA;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 2 */
e.f.b.a.p .a ( p1 );
v0 = /* .line 3 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 4 */
	 (( e.f.b.a.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/a/f;->a(Ljava/lang/Object;)Ljava/lang/CharSequence;
	 /* .line 5 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 6 */
	 v0 = this.a;
	 /* .line 7 */
	 (( e.f.b.a.f ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/b/a/f;->a(Ljava/lang/Object;)Ljava/lang/CharSequence;
} // :cond_0
} // .end method
public java.lang.CharSequence a ( java.lang.Object p0 ) {
/* .locals 1 */
/* .line 12 */
java.util.Objects .requireNonNull ( p1 );
/* .line 13 */
/* instance-of v0, p1, Ljava/lang/CharSequence; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* check-cast p1, Ljava/lang/CharSequence; */
} // :cond_0
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // :goto_0
} // .end method
public final java.lang.String a ( java.lang.Iterable p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Iterable<", */
/* "+", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* .line 10 */
(( e.f.b.a.f ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/b/a/f;->a(Ljava/util/Iterator;)Ljava/lang/String;
} // .end method
public final java.lang.String a ( java.util.Iterator p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Iterator<", */
/* "+", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* .line 11 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( e.f.b.a.f ) p0 ).a ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Le/f/b/a/f;->a(Ljava/lang/StringBuilder;Ljava/util/Iterator;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public final java.lang.StringBuilder a ( java.lang.StringBuilder p0, java.util.Iterator p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/StringBuilder;", */
/* "Ljava/util/Iterator<", */
/* "+", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Ljava/lang/StringBuilder;" */
/* } */
} // .end annotation
/* .line 8 */
try { // :try_start_0
(( e.f.b.a.f ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/b/a/f;->a(Ljava/lang/Appendable;Ljava/util/Iterator;)Ljava/lang/Appendable;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 9 */
/* new-instance p2, Ljava/lang/AssertionError; */
/* invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V */
/* throw p2 */
} // .end method
