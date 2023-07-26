public abstract class e.f.c.l.e.m.a {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.util.regex.Pattern e;
	 /* # instance fields */
	 public final java.lang.String a;
	 public final e.f.c.l.e.q.c b;
	 public final e.f.c.l.e.q.a c;
	 public final java.lang.String d;
	 /* # direct methods */
	 public static e.f.c.l.e.m.a ( ) {
		 /* .locals 2 */
		 final String v0 = "http(s?)://[^\\/]+"; // const-string v0, "http(s?)://[^\\/]+"
		 int v1 = 2; // const/4 v1, 0x2
		 /* .line 1 */
		 java.util.regex.Pattern .compile ( v0,v1 );
		 return;
	 } // .end method
	 public e.f.c.l.e.m.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 if ( p2 != null) { // if-eqz p2, :cond_1
			 if ( p3 != null) { // if-eqz p3, :cond_0
				 /* .line 2 */
				 this.d = p1;
				 /* .line 3 */
				 (( e.f.c.l.e.m.a ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Le/f/c/l/e/m/a;->a(Ljava/lang/String;)Ljava/lang/String;
				 this.a = p1;
				 /* .line 4 */
				 this.b = p3;
				 /* .line 5 */
				 this.c = p4;
				 return;
				 /* .line 6 */
			 } // :cond_0
			 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
			 final String p2 = "requestFactory must not be null."; // const-string p2, "requestFactory must not be null."
			 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
			 /* throw p1 */
			 /* .line 7 */
		 } // :cond_1
		 /* new-instance p1, Ljava/lang/IllegalArgumentException; */
		 final String p2 = "url must not be null."; // const-string p2, "url must not be null."
		 /* invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw p1 */
	 } // .end method
	 /* # virtual methods */
	 public e.f.c.l.e.q.b a ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 java.util.Collections .emptyMap ( );
		 (( e.f.c.l.e.m.a ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/c/l/e/m/a;->a(Ljava/util/Map;)Le/f/c/l/e/q/b;
	 } // .end method
	 public e.f.c.l.e.q.b a ( java.util.Map p0 ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/Map<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* ">;)", */
		 /* "Le/f/c/l/e/q/b;" */
		 /* } */
	 } // .end annotation
	 /* .line 2 */
	 v0 = this.b;
	 v1 = this.c;
	 (( e.f.c.l.e.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/a;->b()Ljava/lang/String;
	 (( e.f.c.l.e.q.c ) v0 ).a ( v1, v2, p1 ); // invoke-virtual {v0, v1, v2, p1}, Le/f/c/l/e/q/c;->a(Le/f/c/l/e/q/a;Ljava/lang/String;Ljava/util/Map;)Le/f/c/l/e/q/b;
	 /* .line 3 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "Crashlytics Android SDK/"; // const-string v1, "Crashlytics Android SDK/"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 4 */
	 e.f.c.l.e.m.b1 .e ( );
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 final String v1 = "User-Agent"; // const-string v1, "User-Agent"
	 (( e.f.c.l.e.q.b ) p1 ).a ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
	 final String v0 = "X-CRASHLYTICS-DEVELOPER-TOKEN"; // const-string v0, "X-CRASHLYTICS-DEVELOPER-TOKEN"
	 final String v1 = "470fa2b4ae81cd56ecbcda9735803434cec591fa"; // const-string v1, "470fa2b4ae81cd56ecbcda9735803434cec591fa"
	 /* .line 5 */
	 (( e.f.c.l.e.q.b ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
} // .end method
public final java.lang.String a ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .line 6 */
	 v0 = this.d;
	 v0 = 	 e.f.c.l.e.m.j .b ( v0 );
	 /* if-nez v0, :cond_0 */
	 /* .line 7 */
	 v0 = e.f.c.l.e.m.a.e;
	 (( java.util.regex.Pattern ) v0 ).matcher ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
	 v0 = this.d;
	 (( java.util.regex.Matcher ) p1 ).replaceFirst ( v0 ); // invoke-virtual {p1, v0}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
} // .end method
public java.lang.String b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
} // .end method
