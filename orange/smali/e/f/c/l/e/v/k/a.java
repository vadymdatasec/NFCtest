public abstract class e.f.c.l.e.v.k.a extends e.f.c.l.e.m.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String f;
	 /* # direct methods */
	 public e.f.c.l.e.v.k.a ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Le/f/c/l/e/m/a;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Le/f/c/l/e/q/a;)V */
		 /* .line 2 */
		 this.f = p5;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final e.f.c.l.e.q.b a ( Object p0, Object p1 ) {
		 /* .locals 2 */
		 /* .line 15 */
		 v0 = this.a;
		 final String v1 = "X-CRASHLYTICS-ORG-ID"; // const-string v1, "X-CRASHLYTICS-ORG-ID"
		 /* .line 16 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
		 p2 = this.b;
		 final String v0 = "X-CRASHLYTICS-GOOGLE-APP-ID"; // const-string v0, "X-CRASHLYTICS-GOOGLE-APP-ID"
		 /* .line 17 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
		 final String p2 = "X-CRASHLYTICS-API-CLIENT-TYPE"; // const-string p2, "X-CRASHLYTICS-API-CLIENT-TYPE"
		 final String v0 = "android"; // const-string v0, "android"
		 /* .line 18 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( p2, v0 ); // invoke-virtual {p1, p2, v0}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
		 p2 = this.f;
		 final String v0 = "X-CRASHLYTICS-API-CLIENT-VERSION"; // const-string v0, "X-CRASHLYTICS-API-CLIENT-VERSION"
		 /* .line 19 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
	 } // .end method
	 public Boolean a ( Object p0, Boolean p1 ) {
		 /* .locals 3 */
		 if ( p2 != null) { // if-eqz p2, :cond_2
			 /* .line 1 */
			 (( e.f.c.l.e.m.a ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/a;->a()Le/f/c/l/e/q/b;
			 /* .line 2 */
			 (( e.f.c.l.e.v.k.a ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/f/c/l/e/v/k/a;->a(Le/f/c/l/e/q/b;Le/f/c/l/e/v/j/a;)Le/f/c/l/e/q/b;
			 /* .line 3 */
			 (( e.f.c.l.e.v.k.a ) p0 ).b ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/f/c/l/e/v/k/a;->b(Le/f/c/l/e/q/b;Le/f/c/l/e/v/j/a;)Le/f/c/l/e/q/b;
			 /* .line 4 */
			 e.f.c.l.e.b .a ( );
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v1 = "Sending app info to "; // const-string v1, "Sending app info to "
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( e.f.c.l.e.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/a;->b()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( e.f.c.l.e.b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
			 /* .line 5 */
			 try { // :try_start_0
				 (( e.f.c.l.e.q.b ) p2 ).b ( ); // invoke-virtual {p2}, Le/f/c/l/e/q/b;->b()Le/f/c/l/e/q/d;
				 /* .line 6 */
				 v0 = 				 (( e.f.c.l.e.q.d ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/l/e/q/d;->b()I
				 final String v1 = "POST"; // const-string v1, "POST"
				 /* .line 7 */
				 (( e.f.c.l.e.q.b ) p2 ).d ( ); // invoke-virtual {p2}, Le/f/c/l/e/q/b;->d()Ljava/lang/String;
				 p2 = 				 (( java.lang.String ) v1 ).equalsIgnoreCase ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
				 if ( p2 != null) { // if-eqz p2, :cond_0
					 final String p2 = "Create"; // const-string p2, "Create"
				 } // :cond_0
				 final String p2 = "Update"; // const-string p2, "Update"
				 /* .line 8 */
			 } // :goto_0
			 e.f.c.l.e.b .a ( );
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
			 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String p2 = " app request ID: "; // const-string p2, " app request ID: "
			 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String p2 = "X-REQUEST-ID"; // const-string p2, "X-REQUEST-ID"
			 /* .line 9 */
			 (( e.f.c.l.e.q.d ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/q/d;->a(Ljava/lang/String;)Ljava/lang/String;
			 (( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( e.f.c.l.e.b ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
			 /* .line 10 */
			 e.f.c.l.e.b .a ( );
			 /* new-instance p2, Ljava/lang/StringBuilder; */
			 /* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v1 = "Result was "; // const-string v1, "Result was "
			 (( java.lang.StringBuilder ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) p2 ).append ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( e.f.c.l.e.b ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
			 /* .line 11 */
			 p1 = 			 e.f.c.l.e.m.w1 .a ( v0 );
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* if-nez p1, :cond_1 */
			 int p1 = 1; // const/4 p1, 0x1
		 } // :cond_1
		 int p1 = 0; // const/4 p1, 0x0
	 } // :goto_1
	 /* :catch_0 */
	 /* move-exception p1 */
	 /* .line 12 */
	 e.f.c.l.e.b .a ( );
	 final String v0 = "HTTP request failed."; // const-string v0, "HTTP request failed."
	 (( e.f.c.l.e.b ) p2 ).b ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
	 /* .line 13 */
	 /* new-instance p2, Ljava/lang/RuntimeException; */
	 /* invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
	 /* throw p2 */
	 /* .line 14 */
} // :cond_2
/* new-instance p1, Ljava/lang/RuntimeException; */
final String p2 = "An invalid data collection token was used."; // const-string p2, "An invalid data collection token was used."
/* invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
public final e.f.c.l.e.q.b b ( Object p0, Object p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
final String v1 = "org_id"; // const-string v1, "org_id"
/* .line 2 */
(( e.f.c.l.e.q.b ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
v0 = this.c;
final String v1 = "app[identifier]"; // const-string v1, "app[identifier]"
/* .line 3 */
(( e.f.c.l.e.q.b ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
v0 = this.g;
final String v1 = "app[name]"; // const-string v1, "app[name]"
/* .line 4 */
(( e.f.c.l.e.q.b ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
v0 = this.d;
final String v1 = "app[display_version]"; // const-string v1, "app[display_version]"
/* .line 5 */
(( e.f.c.l.e.q.b ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
v0 = this.e;
final String v1 = "app[build_version]"; // const-string v1, "app[build_version]"
/* .line 6 */
(( e.f.c.l.e.q.b ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
/* iget v0, p2, Le/f/c/l/e/v/j/a;->h:I */
/* .line 7 */
java.lang.Integer .toString ( v0 );
final String v1 = "app[source]"; // const-string v1, "app[source]"
(( e.f.c.l.e.q.b ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
v0 = this.i;
final String v1 = "app[minimum_sdk_version]"; // const-string v1, "app[minimum_sdk_version]"
/* .line 8 */
(( e.f.c.l.e.q.b ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
v0 = this.j;
final String v1 = "app[built_sdk_version]"; // const-string v1, "app[built_sdk_version]"
/* .line 9 */
(( e.f.c.l.e.q.b ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
/* .line 10 */
v0 = this.f;
v0 = e.f.c.l.e.m.j .b ( v0 );
/* if-nez v0, :cond_0 */
/* .line 11 */
p2 = this.f;
final String v0 = "app[instance_identifier]"; // const-string v0, "app[instance_identifier]"
(( e.f.c.l.e.q.b ) p1 ).b ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
} // :cond_0
} // .end method
