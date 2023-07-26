public class e.f.c.l.e.t.h.e extends e.f.c.l.e.m.a implements e.f.c.l.e.t.h.c {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public final java.lang.String f;
	 /* # direct methods */
	 public e.f.c.l.e.t.h.e ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.f.c.l.e.q.a.c;
		 /* invoke-direct {p0, p1, p2, p3, v0}, Le/f/c/l/e/m/a;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/c/l/e/q/c;Le/f/c/l/e/q/a;)V */
		 /* .line 2 */
		 this.f = p4;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final e.f.c.l.e.q.b a ( Object p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .line 11 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "Crashlytics Android SDK/"; // const-string v1, "Crashlytics Android SDK/"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 12 */
		 e.f.c.l.e.m.b1 .e ( );
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 final String v1 = "User-Agent"; // const-string v1, "User-Agent"
		 /* .line 13 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
		 final String v0 = "X-CRASHLYTICS-API-CLIENT-TYPE"; // const-string v0, "X-CRASHLYTICS-API-CLIENT-TYPE"
		 final String v1 = "android"; // const-string v1, "android"
		 /* .line 14 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
		 v0 = this.f;
		 final String v1 = "X-CRASHLYTICS-API-CLIENT-VERSION"; // const-string v1, "X-CRASHLYTICS-API-CLIENT-VERSION"
		 /* .line 15 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
		 final String v0 = "X-CRASHLYTICS-GOOGLE-APP-ID"; // const-string v0, "X-CRASHLYTICS-GOOGLE-APP-ID"
		 /* .line 16 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
	 } // .end method
	 public final e.f.c.l.e.q.b a ( Object p0, java.lang.String p1, Object p2 ) {
		 /* .locals 5 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 final String v0 = "org_id"; // const-string v0, "org_id"
			 /* .line 17 */
			 (( e.f.c.l.e.q.b ) p1 ).b ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
			 /* .line 18 */
		 } // :cond_0
		 final String v0 = "report_id"; // const-string v0, "report_id"
		 (( e.f.c.l.e.q.b ) p1 ).b ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Le/f/c/l/e/q/b;->b(Ljava/lang/String;Ljava/lang/String;)Le/f/c/l/e/q/b;
		 /* .line 19 */
		 /* array-length p3, p2 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 /* if-ge v0, p3, :cond_b */
	 /* aget-object v1, p2, v0 */
	 /* .line 20 */
	 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
	 final String v3 = "minidump"; // const-string v3, "minidump"
	 v2 = 	 (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 final String v3 = "application/octet-stream"; // const-string v3, "application/octet-stream"
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 /* .line 21 */
		 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
		 final String v4 = "minidump_file"; // const-string v4, "minidump_file"
		 (( e.f.c.l.e.q.b ) p1 ).a ( v4, v2, v3, v1 ); // invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
		 /* goto/16 :goto_1 */
		 /* .line 22 */
	 } // :cond_1
	 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
	 final String v4 = "metadata"; // const-string v4, "metadata"
	 v2 = 	 (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_2
		 /* .line 23 */
		 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
		 final String v4 = "crash_meta_file"; // const-string v4, "crash_meta_file"
		 (( e.f.c.l.e.q.b ) p1 ).a ( v4, v2, v3, v1 ); // invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
		 /* goto/16 :goto_1 */
		 /* .line 24 */
	 } // :cond_2
	 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
	 final String v4 = "binaryImages"; // const-string v4, "binaryImages"
	 v2 = 	 (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_3
		 /* .line 25 */
		 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
		 final String v4 = "binary_images_file"; // const-string v4, "binary_images_file"
		 /* .line 26 */
		 (( e.f.c.l.e.q.b ) p1 ).a ( v4, v2, v3, v1 ); // invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
		 /* goto/16 :goto_1 */
		 /* .line 27 */
	 } // :cond_3
	 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
	 final String v4 = "session"; // const-string v4, "session"
	 v2 = 	 (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_4
		 /* .line 28 */
		 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
		 final String v4 = "session_meta_file"; // const-string v4, "session_meta_file"
		 (( e.f.c.l.e.q.b ) p1 ).a ( v4, v2, v3, v1 ); // invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
		 /* goto/16 :goto_1 */
		 /* .line 29 */
	 } // :cond_4
	 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
	 final String v4 = "app"; // const-string v4, "app"
	 v2 = 	 (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_5
		 /* .line 30 */
		 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
		 final String v4 = "app_meta_file"; // const-string v4, "app_meta_file"
		 (( e.f.c.l.e.q.b ) p1 ).a ( v4, v2, v3, v1 ); // invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
		 /* .line 31 */
	 } // :cond_5
	 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
	 final String v4 = "device"; // const-string v4, "device"
	 v2 = 	 (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_6
		 /* .line 32 */
		 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
		 final String v4 = "device_meta_file"; // const-string v4, "device_meta_file"
		 (( e.f.c.l.e.q.b ) p1 ).a ( v4, v2, v3, v1 ); // invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
		 /* .line 33 */
	 } // :cond_6
	 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
	 final String v4 = "os"; // const-string v4, "os"
	 v2 = 	 (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_7
		 /* .line 34 */
		 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
		 final String v4 = "os_meta_file"; // const-string v4, "os_meta_file"
		 (( e.f.c.l.e.q.b ) p1 ).a ( v4, v2, v3, v1 ); // invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
		 /* .line 35 */
	 } // :cond_7
	 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
	 final String v4 = "user"; // const-string v4, "user"
	 v2 = 	 (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_8
		 /* .line 36 */
		 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
		 final String v4 = "user_meta_file"; // const-string v4, "user_meta_file"
		 (( e.f.c.l.e.q.b ) p1 ).a ( v4, v2, v3, v1 ); // invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
		 /* .line 37 */
	 } // :cond_8
	 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
	 final String v4 = "logs"; // const-string v4, "logs"
	 v2 = 	 (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_9
		 /* .line 38 */
		 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
		 final String v4 = "logs_file"; // const-string v4, "logs_file"
		 (( e.f.c.l.e.q.b ) p1 ).a ( v4, v2, v3, v1 ); // invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
		 /* .line 39 */
	 } // :cond_9
	 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
	 final String v4 = "keys"; // const-string v4, "keys"
	 v2 = 	 (( java.lang.String ) v2 ).equals ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v2 != null) { // if-eqz v2, :cond_a
		 /* .line 40 */
		 (( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
		 final String v4 = "keys_file"; // const-string v4, "keys_file"
		 (( e.f.c.l.e.q.b ) p1 ).a ( v4, v2, v3, v1 ); // invoke-virtual {p1, v4, v2, v3, v1}, Le/f/c/l/e/q/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Le/f/c/l/e/q/b;
	 } // :cond_a
} // :goto_1
/* add-int/lit8 v0, v0, 0x1 */
/* goto/16 :goto_0 */
} // :cond_b
} // .end method
public Boolean a ( Object p0, Boolean p1 ) {
/* .locals 2 */
if ( p2 != null) { // if-eqz p2, :cond_1
/* .line 1 */
(( e.f.c.l.e.m.a ) p0 ).a ( ); // invoke-virtual {p0}, Le/f/c/l/e/m/a;->a()Le/f/c/l/e/q/b;
/* .line 2 */
v0 = this.b;
(( e.f.c.l.e.t.h.e ) p0 ).a ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Le/f/c/l/e/t/h/e;->a(Le/f/c/l/e/q/b;Ljava/lang/String;)Le/f/c/l/e/q/b;
/* .line 3 */
v0 = this.a;
p1 = this.c;
(( e.f.c.l.e.t.h.e ) p0 ).a ( p2, v0, p1 ); // invoke-virtual {p0, p2, v0, p1}, Le/f/c/l/e/t/h/e;->a(Le/f/c/l/e/q/b;Ljava/lang/String;Le/f/c/l/e/t/g/d;)Le/f/c/l/e/q/b;
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
	 p1 = 	 (( e.f.c.l.e.q.d ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/c/l/e/q/d;->b()I
	 /* .line 7 */
	 e.f.c.l.e.b .a ( );
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "Result was: "; // const-string v1, "Result was: "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( e.f.c.l.e.b ) p2 ).a ( v0 ); // invoke-virtual {p2, v0}, Le/f/c/l/e/b;->a(Ljava/lang/String;)V
	 /* .line 8 */
	 p1 = 	 e.f.c.l.e.m.w1 .a ( p1 );
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* if-nez p1, :cond_0 */
	 int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
/* :catch_0 */
/* move-exception p1 */
/* .line 9 */
/* new-instance p2, Ljava/lang/RuntimeException; */
/* invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw p2 */
/* .line 10 */
} // :cond_1
/* new-instance p1, Ljava/lang/RuntimeException; */
final String p2 = "An invalid data collection token was used."; // const-string p2, "An invalid data collection token was used."
/* invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw p1 */
} // .end method
