public class e.f.c.l.e.t.h.d extends e.f.c.l.e.m.a implements e.f.c.l.e.t.h.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String f;
	 /* # direct methods */
	 public e.f.c.l.e.t.h.d ( ) {
		 /* .locals 0 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Le/f/c/l/e/m/a;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Le/f/c/l/e/q/a;)V */
		 /* .line 3 */
		 this.f = p5;
		 return;
	 } // .end method
	 public e.f.c.l.e.t.h.d ( ) {
		 /* .locals 6 */
		 /* .line 1 */
		 v4 = e.f.c.l.e.q.a.c;
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v5, p4 */
		 /* invoke-direct/range {v0 ..v5}, Le/f/c/l/e/t/h/d;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Le/f/c/l/e/q/a;Ljava/lang/String;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final e.f.c.l.e.q.b a ( Object p0, Object p1 ) {
		 /* .locals 2 */
		 /* .line 13 */
		 v0 = this.b;
		 final String v1 = "X-CRASHLYTICS-GOOGLE-APP-ID"; // const-string v1, "X-CRASHLYTICS-GOOGLE-APP-ID"
		 /* .line 14 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
		 final String v0 = "X-CRASHLYTICS-API-CLIENT-TYPE"; // const-string v0, "X-CRASHLYTICS-API-CLIENT-TYPE"
		 final String v1 = "android"; // const-string v1, "android"
		 /* .line 15 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
		 v0 = this.f;
		 final String v1 = "X-CRASHLYTICS-API-CLIENT-VERSION"; // const-string v1, "X-CRASHLYTICS-API-CLIENT-VERSION"
		 /* .line 16 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
		 /* .line 17 */
		 p2 = this.c;
		 /* .line 18 */
	 v0 = 	 } // :goto_0
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* check-cast v0, Ljava/util/Map$Entry; */
		 /* .line 19 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/q/b;->a(Ljava/util/Map$Entry;)Le/f/c/l/e/q/b;
	 } // :cond_0
} // .end method
public final e.f.c.l.e.q.b a ( Object p0, Object p1 ) {
	 /* .locals 11 */
	 /* .line 20 */
	 final String v1 = "report[identifier]"; // const-string v1, "report[identifier]"
	 (( e.f.c.l.e.q.b ) p1 ).b ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
	 /* .line 21 */
	 /* array-length v0, v0 */
	 final String v1 = "application/octet-stream"; // const-string v1, "application/octet-stream"
	 final String v2 = " to report "; // const-string v2, " to report "
	 int v3 = 1; // const/4 v3, 0x1
	 /* if-ne v0, v3, :cond_0 */
	 /* .line 22 */
	 e.f.c.l.e.b .a ( );
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "Adding single file "; // const-string v4, "Adding single file "
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 23 */
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( e.f.c.l.e.b ) v0 ).a ( v2 ); // invoke-virtual {v0, v2}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
	 /* .line 24 */
	 final String v2 = "report[file]"; // const-string v2, "report[file]"
	 (( e.f.c.l.e.q.b ) p1 ).a ( v2, v0, v1, p2 ); // invoke-virtual {p1, v2, v0, v1, p2}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
	 /* .line 25 */
} // :cond_0
/* array-length v4, v0 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
} // :goto_0
/* if-ge v5, v4, :cond_1 */
/* aget-object v7, v0, v5 */
/* .line 26 */
e.f.c.l.e.b .a ( );
/* new-instance v9, Ljava/lang/StringBuilder; */
/* invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V */
final String v10 = "Adding file "; // const-string v10, "Adding file "
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 27 */
(( java.io.File ) v7 ).getName ( ); // invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).append ( v2 ); // invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v8 ).a ( v9 ); // invoke-virtual {v8, v9}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 28 */
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
final String v9 = "report[file"; // const-string v9, "report[file"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v9 = "]"; // const-string v9, "]"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.File ) v7 ).getName ( ); // invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;
(( e.f.c.l.e.q.b ) p1 ).a ( v8, v9, v1, v7 ); // invoke-virtual {p1, v8, v9, v1, v7}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
/* add-int/2addr v6, v3 */
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_1
} // .end method
public Boolean a ( Object p0, Boolean p1 ) {
/* .locals 3 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 1 */
(( e.f.c.l.e.m.a ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/a;->a()Le/f/c/l/e/q/b;
/* .line 2 */
(( e.f.c.l.e.t.h.d ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/f/c/l/e/t/h/d;->a(Le/f/c/l/e/q/b;Le/f/c/l/e/t/g/a;)Le/f/c/l/e/q/b;
/* .line 3 */
p1 = this.c;
(( e.f.c.l.e.t.h.d ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/f/c/l/e/t/h/d;->a(Le/f/c/l/e/q/b;Le/f/c/l/e/t/g/d;)Le/f/c/l/e/q/b;
/* .line 4 */
e.f.c.l.e.b .a ( );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Sending report to: "; // const-string v1, "Sending report to: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( e.f.c.l.e.m.a ) p0 ).b ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/a;->b()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 5 */
try { // :try_start_0
(( e.f.c.l.e.q.b ) p2 ).b ( ); // invoke-virtual {p2}, Le/f/c/l/e/q/b;->b()Le/f/c/l/e/q/d;
/* .line 6 */
p2 = (( e.f.c.l.e.q.d ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/l/e/q/d;->b()I
/* .line 7 */
e.f.c.l.e.b .a ( );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Create report request ID: "; // const-string v2, "Create report request ID: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "X-REQUEST-ID"; // const-string v2, "X-REQUEST-ID"
(( e.f.c.l.e.q.d ) p1 ).a ( v2 ); // invoke-virtual {p1, v2}, Le/f/c/l/e/q/d;->a(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 8 */
e.f.c.l.e.b .a ( );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Result was: "; // const-string v1, "Result was: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( e.f.c.l.e.b ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
/* .line 9 */
p1 = e.f.c.l.e.m.w1 .a ( p2 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-nez p1, :cond_0 */
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* :catch_0 */
/* move-exception p1 */
/* .line 10 */
e.f.c.l.e.b .a ( );
final String v0 = "Create report HTTP request failed."; // const-string v0, "Create report HTTP request failed."
(( e.f.c.l.e.b ) p2 ).b ( v0, p1 ); // invoke-virtual {p2, v0, p1}, Le/f/c/l/e/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
/* .line 11 */
/* new-instance p2, Ljava/lang/RuntimeException; */
/* invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw p2 */
/* .line 12 */
} // :cond_1
/* new-instance p1, Ljava/lang/RuntimeException; */
final String p2 = "An invalid data collection token was used."; // const-string p2, "An invalid data collection token was used."
/* invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
