public class e.f.a.a.j.j0.k.i0 implements e.f.a.a.j.j0.k.e implements e.f.a.a.j.k0.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final e.f.a.a.b f;
	 /* # instance fields */
	 public final e.f.a.a.j.j0.k.p0 b;
	 public final e.f.a.a.j.l0.a c;
	 public final e.f.a.a.j.l0.a d;
	 public final e.f.a.a.j.j0.k.g e;
	 /* # direct methods */
	 public static e.f.a.a.j.j0.k.i0 ( ) {
		 /* .locals 1 */
		 final String v0 = "proto"; // const-string v0, "proto"
		 /* .line 1 */
		 e.f.a.a.b .a ( v0 );
		 return;
	 } // .end method
	 public e.f.a.a.j.j0.k.i0 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.b = p4;
		 /* .line 3 */
		 this.c = p1;
		 /* .line 4 */
		 this.d = p2;
		 /* .line 5 */
		 this.e = p3;
		 return;
	 } // .end method
	 public static java.lang.Boolean a ( e.f.a.a.j.j0.k.i0 p0, Object p1, android.database.sqlite.SQLiteDatabase p2 ) { //synthethic
		 /* .locals 1 */
		 /* .line 63 */
		 (( e.f.a.a.j.j0.k.i0 ) p0 ).b ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/f/a/a/j/j0/k/i0;->b(Landroid/database/sqlite/SQLiteDatabase;Le/f/a/a/j/x;)Ljava/lang/Long;
		 int p2 = 0; // const/4 p2, 0x0
		 /* if-nez p1, :cond_0 */
		 /* .line 64 */
		 java.lang.Boolean .valueOf ( p2 );
		 /* .line 65 */
	 } // :cond_0
	 (( e.f.a.a.j.j0.k.i0 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/k/i0;->c()Landroid/database/sqlite/SQLiteDatabase;
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v0, v0, [Ljava/lang/String; */
	 /* .line 66 */
	 (( java.lang.Long ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Long;->toString()Ljava/lang/String;
	 /* aput-object p1, v0, p2 */
	 final String p1 = "SELECT 1 FROM events WHERE context_id = ? LIMIT 1"; // const-string p1, "SELECT 1 FROM events WHERE context_id = ? LIMIT 1"
	 /* .line 67 */
	 (( android.database.sqlite.SQLiteDatabase ) p0 ).rawQuery ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
	 e.f.a.a.j.j0.k.x .a ( );
	 /* .line 68 */
	 e.f.a.a.j.j0.k.i0 .a ( p0,p1 );
	 /* check-cast p0, Ljava/lang/Boolean; */
} // .end method
public static java.lang.Integer a ( Long p0, android.database.sqlite.SQLiteDatabase p1 ) { //synthethic
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* new-array v0, v0, [Ljava/lang/String; */
	 /* .line 78 */
	 java.lang.String .valueOf ( p0,p1 );
	 int p1 = 0; // const/4 p1, 0x0
	 /* aput-object p0, v0, p1 */
	 final String p0 = "events"; // const-string p0, "events"
	 final String p1 = "timestamp_ms < ?"; // const-string p1, "timestamp_ms < ?"
	 p0 = 	 (( android.database.sqlite.SQLiteDatabase ) p2 ).delete ( p0, p1, v0 ); // invoke-virtual {p2, p0, p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
	 java.lang.Integer .valueOf ( p0 );
} // .end method
public static java.lang.Long a ( android.database.Cursor p0 ) { //synthethic
	 /* .locals 2 */
	 v0 = 	 /* .line 60 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 61 */
		 /* move-result-wide v0 */
		 java.lang.Long .valueOf ( v0,v1 );
	 } // :cond_0
	 /* const-wide/16 v0, 0x0 */
	 /* .line 62 */
	 java.lang.Long .valueOf ( v0,v1 );
} // .end method
public static java.lang.Long a ( e.f.a.a.j.j0.k.i0 p0, Object p1, Object p2, android.database.sqlite.SQLiteDatabase p3 ) { //synthethic
	 /* .locals 10 */
	 /* .line 8 */
	 v0 = 	 (( e.f.a.a.j.j0.k.i0 ) p0 ).n ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/k/i0;->n()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* const-wide/16 p0, -0x1 */
		 /* .line 9 */
		 java.lang.Long .valueOf ( p0,p1 );
		 /* .line 10 */
	 } // :cond_0
	 (( e.f.a.a.j.j0.k.i0 ) p0 ).a ( p3, p1 ); // invoke-virtual {p0, p3, p1}, Le/f/a/a/j/j0/k/i0;->a(Landroid/database/sqlite/SQLiteDatabase;Le/f/a/a/j/x;)J
	 /* move-result-wide v0 */
	 /* .line 11 */
	 p0 = this.e;
	 p0 = 	 (( e.f.a.a.j.j0.k.g ) p0 ).d ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/k/g;->d()I
	 /* .line 12 */
	 (( e.f.a.a.j.q ) p2 ).c ( ); // invoke-virtual {p2}, Le/f/a/a/j/q;->c()Le/f/a/a/j/o;
	 (( e.f.a.a.j.o ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/a/j/o;->a()[B
	 /* .line 13 */
	 /* array-length v2, p1 */
	 int v3 = 0; // const/4 v3, 0x0
	 int v4 = 1; // const/4 v4, 0x1
	 /* if-gt v2, p0, :cond_1 */
	 int v2 = 1; // const/4 v2, 0x1
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
/* .line 14 */
} // :goto_0
/* new-instance v5, Landroid/content/ContentValues; */
/* invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V */
/* .line 15 */
java.lang.Long .valueOf ( v0,v1 );
final String v1 = "context_id"; // const-string v1, "context_id"
(( android.content.ContentValues ) v5 ).put ( v1, v0 ); // invoke-virtual {v5, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
/* .line 16 */
(( e.f.a.a.j.q ) p2 ).f ( ); // invoke-virtual {p2}, Le/f/a/a/j/q;->f()Ljava/lang/String;
final String v1 = "transport_name"; // const-string v1, "transport_name"
(( android.content.ContentValues ) v5 ).put ( v1, v0 ); // invoke-virtual {v5, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 17 */
(( e.f.a.a.j.q ) p2 ).d ( ); // invoke-virtual {p2}, Le/f/a/a/j/q;->d()J
/* move-result-wide v0 */
java.lang.Long .valueOf ( v0,v1 );
final String v1 = "timestamp_ms"; // const-string v1, "timestamp_ms"
(( android.content.ContentValues ) v5 ).put ( v1, v0 ); // invoke-virtual {v5, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
/* .line 18 */
(( e.f.a.a.j.q ) p2 ).g ( ); // invoke-virtual {p2}, Le/f/a/a/j/q;->g()J
/* move-result-wide v0 */
java.lang.Long .valueOf ( v0,v1 );
final String v1 = "uptime_ms"; // const-string v1, "uptime_ms"
(( android.content.ContentValues ) v5 ).put ( v1, v0 ); // invoke-virtual {v5, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
/* .line 19 */
(( e.f.a.a.j.q ) p2 ).c ( ); // invoke-virtual {p2}, Le/f/a/a/j/q;->c()Le/f/a/a/j/o;
(( e.f.a.a.j.o ) v0 ).b ( ); // invoke-virtual {v0}, Le/f/a/a/j/o;->b()Le/f/a/a/b;
(( e.f.a.a.b ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/a/a/b;->a()Ljava/lang/String;
final String v1 = "payload_encoding"; // const-string v1, "payload_encoding"
(( android.content.ContentValues ) v5 ).put ( v1, v0 ); // invoke-virtual {v5, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 20 */
(( e.f.a.a.j.q ) p2 ).b ( ); // invoke-virtual {p2}, Le/f/a/a/j/q;->b()Ljava/lang/Integer;
final String v1 = "code"; // const-string v1, "code"
(( android.content.ContentValues ) v5 ).put ( v1, v0 ); // invoke-virtual {v5, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 21 */
java.lang.Integer .valueOf ( v3 );
final String v1 = "num_attempts"; // const-string v1, "num_attempts"
(( android.content.ContentValues ) v5 ).put ( v1, v0 ); // invoke-virtual {v5, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 22 */
java.lang.Boolean .valueOf ( v2 );
final String v1 = "inline"; // const-string v1, "inline"
(( android.content.ContentValues ) v5 ).put ( v1, v0 ); // invoke-virtual {v5, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V
if ( v2 != null) { // if-eqz v2, :cond_2
/* move-object v0, p1 */
} // :cond_2
/* new-array v0, v3, [B */
} // :goto_1
final String v1 = "payload"; // const-string v1, "payload"
/* .line 23 */
(( android.content.ContentValues ) v5 ).put ( v1, v0 ); // invoke-virtual {v5, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
int v0 = 0; // const/4 v0, 0x0
final String v1 = "events"; // const-string v1, "events"
/* .line 24 */
(( android.database.sqlite.SQLiteDatabase ) p3 ).insert ( v1, v0, v5 ); // invoke-virtual {p3, v1, v0, v5}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
/* move-result-wide v5 */
final String v1 = "event_id"; // const-string v1, "event_id"
/* if-nez v2, :cond_3 */
/* .line 25 */
/* array-length v2, p1 */
/* int-to-double v2, v2 */
/* int-to-double v7, p0 */
/* div-double/2addr v2, v7 */
java.lang.Math .ceil ( v2,v3 );
/* move-result-wide v2 */
/* double-to-int v2, v2 */
} // :goto_2
/* if-gt v4, v2, :cond_3 */
/* add-int/lit8 v3, v4, -0x1 */
/* mul-int v3, v3, p0 */
/* mul-int v7, v4, p0 */
/* .line 26 */
/* array-length v8, p1 */
/* .line 27 */
v7 = java.lang.Math .min ( v7,v8 );
/* .line 28 */
java.util.Arrays .copyOfRange ( p1,v3,v7 );
/* .line 29 */
/* new-instance v7, Landroid/content/ContentValues; */
/* invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V */
/* .line 30 */
java.lang.Long .valueOf ( v5,v6 );
(( android.content.ContentValues ) v7 ).put ( v1, v8 ); // invoke-virtual {v7, v1, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
/* .line 31 */
java.lang.Integer .valueOf ( v4 );
final String v9 = "sequence_num"; // const-string v9, "sequence_num"
(( android.content.ContentValues ) v7 ).put ( v9, v8 ); // invoke-virtual {v7, v9, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
final String v8 = "bytes"; // const-string v8, "bytes"
/* .line 32 */
(( android.content.ContentValues ) v7 ).put ( v8, v3 ); // invoke-virtual {v7, v8, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V
final String v3 = "event_payloads"; // const-string v3, "event_payloads"
/* .line 33 */
(( android.database.sqlite.SQLiteDatabase ) p3 ).insert ( v3, v0, v7 ); // invoke-virtual {p3, v3, v0, v7}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
/* add-int/lit8 v4, v4, 0x1 */
/* .line 34 */
} // :cond_3
(( e.f.a.a.j.q ) p2 ).e ( ); // invoke-virtual {p2}, Le/f/a/a/j/q;->e()Ljava/util/Map;
p1 = } // :goto_3
if ( p1 != null) { // if-eqz p1, :cond_4
/* check-cast p1, Ljava/util/Map$Entry; */
/* .line 35 */
/* new-instance p2, Landroid/content/ContentValues; */
/* invoke-direct {p2}, Landroid/content/ContentValues;-><init>()V */
/* .line 36 */
java.lang.Long .valueOf ( v5,v6 );
(( android.content.ContentValues ) p2 ).put ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
/* .line 37 */
/* check-cast v2, Ljava/lang/String; */
final String v3 = "name"; // const-string v3, "name"
(( android.content.ContentValues ) p2 ).put ( v3, v2 ); // invoke-virtual {p2, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 38 */
/* check-cast p1, Ljava/lang/String; */
final String v2 = "value"; // const-string v2, "value"
(( android.content.ContentValues ) p2 ).put ( v2, p1 ); // invoke-virtual {p2, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
final String p1 = "event_metadata"; // const-string p1, "event_metadata"
/* .line 39 */
(( android.database.sqlite.SQLiteDatabase ) p3 ).insert ( p1, v0, p2 ); // invoke-virtual {p3, p1, v0, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
/* .line 40 */
} // :cond_4
java.lang.Long .valueOf ( v5,v6 );
} // .end method
public static java.lang.Object a ( Long p0, Object p1, android.database.sqlite.SQLiteDatabase p2 ) { //synthethic
/* .locals 3 */
/* .line 70 */
/* new-instance v0, Landroid/content/ContentValues; */
/* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
/* .line 71 */
java.lang.Long .valueOf ( p0,p1 );
final String p1 = "next_request_ms"; // const-string p1, "next_request_ms"
(( android.content.ContentValues ) v0 ).put ( p1, p0 ); // invoke-virtual {v0, p1, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V
int p0 = 2; // const/4 p0, 0x2
/* new-array p0, p0, [Ljava/lang/String; */
/* .line 72 */
(( e.f.a.a.j.x ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/a/a/j/x;->a()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
/* aput-object p1, p0, v1 */
/* .line 73 */
(( e.f.a.a.j.x ) p2 ).c ( ); // invoke-virtual {p2}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
p1 = e.f.a.a.j.m0.a .a ( p1 );
java.lang.String .valueOf ( p1 );
int v1 = 1; // const/4 v1, 0x1
/* aput-object p1, p0, v1 */
final String p1 = "transport_contexts"; // const-string p1, "transport_contexts"
final String v2 = "backend_name = ? and priority = ?"; // const-string v2, "backend_name = ? and priority = ?"
/* .line 74 */
p0 = (( android.database.sqlite.SQLiteDatabase ) p3 ).update ( p1, v0, v2, p0 ); // invoke-virtual {p3, p1, v0, v2, p0}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
int v2 = 0; // const/4 v2, 0x0
/* if-ge p0, v1, :cond_0 */
/* .line 75 */
(( e.f.a.a.j.x ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/a/a/j/x;->a()Ljava/lang/String;
final String v1 = "backend_name"; // const-string v1, "backend_name"
(( android.content.ContentValues ) v0 ).put ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 76 */
(( e.f.a.a.j.x ) p2 ).c ( ); // invoke-virtual {p2}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
p0 = e.f.a.a.j.m0.a .a ( p0 );
java.lang.Integer .valueOf ( p0 );
final String p2 = "priority"; // const-string p2, "priority"
(( android.content.ContentValues ) v0 ).put ( p2, p0 ); // invoke-virtual {v0, p2, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 77 */
(( android.database.sqlite.SQLiteDatabase ) p3 ).insert ( p1, v2, v0 ); // invoke-virtual {p3, p1, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
} // :cond_0
} // .end method
public static java.lang.Object a ( android.database.Cursor p0, e.f.a.a.j.j0.k.f0 p1 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Landroid/database/Cursor;", */
/* "Le/f/a/a/j/j0/k/f0<", */
/* "Landroid/database/Cursor;", */
/* "TT;>;)TT;" */
/* } */
} // .end annotation
/* .line 140 */
try { // :try_start_0
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 141 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 142 */
/* throw p1 */
} // .end method
public static java.lang.Object a ( e.f.a.a.j.j0.k.i0 p0, java.util.List p1, Object p2, android.database.Cursor p3 ) { //synthethic
/* .locals 6 */
/* .line 79 */
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_3
int v0 = 0; // const/4 v0, 0x0
/* .line 80 */
/* move-result-wide v1 */
int v3 = 7; // const/4 v3, 0x7
v3 = /* .line 81 */
int v4 = 1; // const/4 v4, 0x1
if ( v3 != null) { // if-eqz v3, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 82 */
} // :cond_0
e.f.a.a.j.q .i ( );
/* .line 83 */
(( e.f.a.a.j.p ) v3 ).a ( v4 ); // invoke-virtual {v3, v4}, Le/f/a/a/j/p;->a(Ljava/lang/String;)Le/f/a/a/j/p;
int v4 = 2; // const/4 v4, 0x2
/* .line 84 */
/* move-result-wide v4 */
(( e.f.a.a.j.p ) v3 ).a ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Le/f/a/a/j/p;->a(J)Le/f/a/a/j/p;
int v4 = 3; // const/4 v4, 0x3
/* .line 85 */
/* move-result-wide v4 */
(( e.f.a.a.j.p ) v3 ).b ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Le/f/a/a/j/p;->b(J)Le/f/a/a/j/p;
int v4 = 4; // const/4 v4, 0x4
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 86 */
/* new-instance v0, Le/f/a/a/j/o; */
/* .line 87 */
e.f.a.a.j.j0.k.i0 .c ( v4 );
int v5 = 5; // const/4 v5, 0x5
/* invoke-direct {v0, v4, v5}, Le/f/a/a/j/o;-><init>(Le/f/a/a/b;[B)V */
/* .line 88 */
(( e.f.a.a.j.p ) v3 ).a ( v0 ); // invoke-virtual {v3, v0}, Le/f/a/a/j/p;->a(Le/f/a/a/j/o;)Le/f/a/a/j/p;
/* .line 89 */
} // :cond_1
/* new-instance v0, Le/f/a/a/j/o; */
/* .line 90 */
e.f.a.a.j.j0.k.i0 .c ( v4 );
(( e.f.a.a.j.j0.k.i0 ) p0 ).g ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Le/f/a/a/j/j0/k/i0;->g(J)[B
/* invoke-direct {v0, v4, v5}, Le/f/a/a/j/o;-><init>(Le/f/a/a/b;[B)V */
/* .line 91 */
(( e.f.a.a.j.p ) v3 ).a ( v0 ); // invoke-virtual {v3, v0}, Le/f/a/a/j/p;->a(Le/f/a/a/j/o;)Le/f/a/a/j/p;
} // :goto_1
int v0 = 6; // const/4 v0, 0x6
v4 = /* .line 92 */
/* if-nez v4, :cond_2 */
v0 = /* .line 93 */
java.lang.Integer .valueOf ( v0 );
(( e.f.a.a.j.p ) v3 ).a ( v0 ); // invoke-virtual {v3, v0}, Le/f/a/a/j/p;->a(Ljava/lang/Integer;)Le/f/a/a/j/p;
/* .line 94 */
} // :cond_2
(( e.f.a.a.j.p ) v3 ).a ( ); // invoke-virtual {v3}, Le/f/a/a/j/p;->a()Le/f/a/a/j/q;
e.f.a.a.j.j0.k.l .a ( v1,v2,p2,v0 );
} // :cond_3
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.Object a ( java.lang.String p0, android.database.sqlite.SQLiteDatabase p1 ) { //synthethic
/* .locals 0 */
/* .line 50 */
(( android.database.sqlite.SQLiteDatabase ) p1 ).compileStatement ( p0 ); // invoke-virtual {p1, p0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
(( android.database.sqlite.SQLiteStatement ) p0 ).execute ( ); // invoke-virtual {p0}, Landroid/database/sqlite/SQLiteStatement;->execute()V
final String p0 = "DELETE FROM events WHERE num_attempts >= 16"; // const-string p0, "DELETE FROM events WHERE num_attempts >= 16"
/* .line 51 */
(( android.database.sqlite.SQLiteDatabase ) p1 ).compileStatement ( p0 ); // invoke-virtual {p1, p0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
(( android.database.sqlite.SQLiteStatement ) p0 ).execute ( ); // invoke-virtual {p0}, Landroid/database/sqlite/SQLiteStatement;->execute()V
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.lang.Object a ( java.lang.Throwable p0 ) { //synthethic
/* .locals 2 */
/* .line 127 */
/* new-instance v0, Lcom/google/android/datatransport/runtime/synchronization/SynchronizationException; */
final String v1 = "Timed out while trying to acquire the lock."; // const-string v1, "Timed out while trying to acquire the lock."
/* invoke-direct {v0, v1, p0}, Lcom/google/android/datatransport/runtime/synchronization/SynchronizationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
public static java.lang.Object a ( java.util.Map p0, android.database.Cursor p1 ) { //synthethic
/* .locals 5 */
/* .line 106 */
v0 = } // :goto_0
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 107 */
/* move-result-wide v2 */
/* .line 108 */
java.lang.Long .valueOf ( v2,v3 );
/* check-cast v0, Ljava/util/Set; */
/* if-nez v0, :cond_0 */
/* .line 109 */
/* new-instance v0, Ljava/util/HashSet; */
/* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
/* .line 110 */
java.lang.Long .valueOf ( v2,v3 );
/* .line 111 */
} // :cond_0
/* new-instance v2, Le/f/a/a/j/j0/k/g0; */
int v3 = 1; // const/4 v3, 0x1
int v4 = 2; // const/4 v4, 0x2
/* invoke-direct {v2, v3, v4, v1}, Le/f/a/a/j/j0/k/g0;-><init>(Ljava/lang/String;Ljava/lang/String;Le/f/a/a/j/j0/k/e0;)V */
} // :cond_1
} // .end method
public static android.database.sqlite.SQLiteDatabase b ( java.lang.Throwable p0 ) { //synthethic
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Lcom/google/android/datatransport/runtime/synchronization/SynchronizationException; */
final String v1 = "Timed out while trying to open db."; // const-string v1, "Timed out while trying to open db."
/* invoke-direct {v0, v1, p0}, Lcom/google/android/datatransport/runtime/synchronization/SynchronizationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
public static java.lang.Long b ( android.database.Cursor p0 ) { //synthethic
/* .locals 2 */
v0 = /* .line 15 */
/* if-nez v0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 16 */
/* move-result-wide v0 */
java.lang.Long .valueOf ( v0,v1 );
} // .end method
public static java.lang.Object b ( android.database.sqlite.SQLiteDatabase p0 ) { //synthethic
/* .locals 0 */
/* .line 25 */
(( android.database.sqlite.SQLiteDatabase ) p0 ).beginTransaction ( ); // invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static java.util.List b ( e.f.a.a.j.j0.k.i0 p0, Object p1, android.database.sqlite.SQLiteDatabase p2 ) { //synthethic
/* .locals 0 */
/* .line 22 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).c ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/f/a/a/j/j0/k/i0;->c(Landroid/database/sqlite/SQLiteDatabase;Le/f/a/a/j/x;)Ljava/util/List;
/* .line 23 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).a ( p2, p1 ); // invoke-virtual {p0, p2, p1}, Le/f/a/a/j/j0/k/i0;->a(Landroid/database/sqlite/SQLiteDatabase;Ljava/util/List;)Ljava/util/Map;
(( e.f.a.a.j.j0.k.i0 ) p0 ).a ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/a/a/j/j0/k/i0;->a(Ljava/util/List;Ljava/util/Map;)Ljava/util/List;
} // .end method
public static b ( java.lang.String p0 ) {
/* .locals 1 */
/* if-nez p0, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 24 */
android.util.Base64 .decode ( p0,v0 );
} // .end method
public static e.f.a.a.b c ( java.lang.String p0 ) {
/* .locals 0 */
/* if-nez p0, :cond_0 */
/* .line 30 */
p0 = e.f.a.a.j.j0.k.i0.f;
/* .line 31 */
} // :cond_0
e.f.a.a.b .a ( p0 );
} // .end method
public static java.lang.String c ( java.lang.Iterable p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Iterable<", */
/* "Le/f/a/a/j/j0/k/l;", */
/* ">;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* .line 4 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "("; // const-string v1, "("
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 5 */
/* .line 6 */
} // :cond_0
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 7 */
/* check-cast v1, Le/f/a/a/j/j0/k/l; */
(( e.f.a.a.j.j0.k.l ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/a/a/j/j0/k/l;->b()J
/* move-result-wide v1 */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
v1 = /* .line 8 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* const/16 v1, 0x2c */
/* .line 9 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // :cond_1
/* const/16 p0, 0x29 */
/* .line 10 */
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 11 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.util.List c ( android.database.Cursor p0 ) { //synthethic
/* .locals 3 */
/* .line 15 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 16 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 17 */
e.f.a.a.j.x .d ( );
int v2 = 1; // const/4 v2, 0x1
/* .line 18 */
(( e.f.a.a.j.x$a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/a/a/j/x$a;->a(Ljava/lang/String;)Le/f/a/a/j/x$a;
int v2 = 2; // const/4 v2, 0x2
v2 = /* .line 19 */
e.f.a.a.j.m0.a .a ( v2 );
(( e.f.a.a.j.x$a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/a/a/j/x$a;->a(Le/f/a/a/d;)Le/f/a/a/j/x$a;
int v2 = 3; // const/4 v2, 0x3
/* .line 20 */
e.f.a.a.j.j0.k.i0 .b ( v2 );
(( e.f.a.a.j.x$a ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Le/f/a/a/j/x$a;->a([B)Le/f/a/a/j/x$a;
/* .line 21 */
(( e.f.a.a.j.x$a ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/a/a/j/x$a;->a()Le/f/a/a/j/x;
/* .line 22 */
} // :cond_0
} // .end method
public static java.util.List c ( android.database.sqlite.SQLiteDatabase p0 ) { //synthethic
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/String; */
final String v1 = "SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id"; // const-string v1, "SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id"
/* .line 13 */
(( android.database.sqlite.SQLiteDatabase ) p0 ).rawQuery ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
e.f.a.a.j.j0.k.w .a ( );
/* .line 14 */
e.f.a.a.j.j0.k.i0 .a ( p0,v0 );
/* check-cast p0, Ljava/util/List; */
} // .end method
public static d ( android.database.Cursor p0 ) { //synthethic
/* .locals 6 */
/* .line 3 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 4 */
v3 = } // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 5 */
/* .line 6 */
/* .line 7 */
/* array-length v3, v3 */
/* add-int/2addr v2, v3 */
/* .line 8 */
} // :cond_0
/* new-array p0, v2, [B */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 9 */
v4 = } // :goto_1
/* if-ge v2, v4, :cond_1 */
/* .line 10 */
/* check-cast v4, [B */
/* .line 11 */
/* array-length v5, v4 */
java.lang.System .arraycopy ( v4,v1,p0,v3,v5 );
/* .line 12 */
/* array-length v4, v4 */
/* add-int/2addr v3, v4 */
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
} // .end method
/* # virtual methods */
public final Long a ( android.database.sqlite.SQLiteDatabase p0, Object p1 ) {
/* .locals 4 */
/* .line 41 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).b ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Le/f/a/a/j/j0/k/i0;->b(Landroid/database/sqlite/SQLiteDatabase;Le/f/a/a/j/x;)Ljava/lang/Long;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 42 */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide p1 */
/* return-wide p1 */
/* .line 43 */
} // :cond_0
/* new-instance v0, Landroid/content/ContentValues; */
/* invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V */
/* .line 44 */
(( e.f.a.a.j.x ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/a/a/j/x;->a()Ljava/lang/String;
final String v2 = "backend_name"; // const-string v2, "backend_name"
(( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 45 */
(( e.f.a.a.j.x ) p2 ).c ( ); // invoke-virtual {p2}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
v1 = e.f.a.a.j.m0.a .a ( v1 );
java.lang.Integer .valueOf ( v1 );
final String v2 = "priority"; // const-string v2, "priority"
(( android.content.ContentValues ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
int v1 = 0; // const/4 v1, 0x0
/* .line 46 */
java.lang.Integer .valueOf ( v1 );
final String v3 = "next_request_ms"; // const-string v3, "next_request_ms"
(( android.content.ContentValues ) v0 ).put ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V
/* .line 47 */
(( e.f.a.a.j.x ) p2 ).b ( ); // invoke-virtual {p2}, Le/f/a/a/j/x;->b()[B
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 48 */
(( e.f.a.a.j.x ) p2 ).b ( ); // invoke-virtual {p2}, Le/f/a/a/j/x;->b()[B
android.util.Base64 .encodeToString ( p2,v1 );
final String v1 = "extras"; // const-string v1, "extras"
(( android.content.ContentValues ) v0 ).put ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
} // :cond_1
int p2 = 0; // const/4 p2, 0x0
final String v1 = "transport_contexts"; // const-string v1, "transport_contexts"
/* .line 49 */
(( android.database.sqlite.SQLiteDatabase ) p1 ).insert ( v1, p2, v0 ); // invoke-virtual {p1, v1, p2, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
/* move-result-wide p1 */
/* return-wide p1 */
} // .end method
public Long a ( Object p0 ) {
/* .locals 4 */
/* .line 55 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/k/i0;->c()Landroid/database/sqlite/SQLiteDatabase;
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [Ljava/lang/String; */
/* .line 56 */
(( e.f.a.a.j.x ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->a()Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
/* aput-object v2, v1, v3 */
/* .line 57 */
(( e.f.a.a.j.x ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
p1 = e.f.a.a.j.m0.a .a ( p1 );
java.lang.String .valueOf ( p1 );
int v2 = 1; // const/4 v2, 0x1
/* aput-object p1, v1, v2 */
final String p1 = "SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?"; // const-string p1, "SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?"
/* .line 58 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).rawQuery ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
e.f.a.a.j.j0.k.c0 .a ( );
/* .line 59 */
e.f.a.a.j.j0.k.i0 .a ( p1,v0 );
/* check-cast p1, Ljava/lang/Long; */
(( java.lang.Long ) p1 ).longValue ( ); // invoke-virtual {p1}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public e.f.a.a.j.j0.k.l a ( Object p0, Object p1 ) {
/* .locals 5 */
int v0 = 3; // const/4 v0, 0x3
/* new-array v0, v0, [Ljava/lang/Object; */
/* .line 1 */
(( e.f.a.a.j.x ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
int v2 = 0; // const/4 v2, 0x0
/* aput-object v1, v0, v2 */
/* .line 2 */
(( e.f.a.a.j.q ) p2 ).f ( ); // invoke-virtual {p2}, Le/f/a/a/j/q;->f()Ljava/lang/String;
int v2 = 1; // const/4 v2, 0x1
/* aput-object v1, v0, v2 */
/* .line 3 */
(( e.f.a.a.j.x ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/a/j/x;->a()Ljava/lang/String;
int v2 = 2; // const/4 v2, 0x2
/* aput-object v1, v0, v2 */
final String v1 = "SQLiteEventStore"; // const-string v1, "SQLiteEventStore"
final String v2 = "Storing event with priority=%s, name=%s for destination %s"; // const-string v2, "Storing event with priority=%s, name=%s for destination %s"
/* .line 4 */
e.f.a.a.j.h0.a .a ( v1,v2,v0 );
/* .line 5 */
e.f.a.a.j.j0.k.z .a ( p0,p1,p2 );
/* .line 6 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/a/j/j0/k/i0;->a(Le/f/a/a/j/j0/k/f0;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
/* const-wide/16 v2, 0x1 */
/* cmp-long v4, v0, v2 */
/* if-gez v4, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 7 */
} // :cond_0
e.f.a.a.j.j0.k.l .a ( v0,v1,p1,p2 );
} // .end method
public final java.lang.Object a ( e.f.a.a.j.j0.k.f0 p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/a/j/j0/k/f0<", */
/* "Landroid/database/sqlite/SQLiteDatabase;", */
/* "TT;>;)TT;" */
/* } */
} // .end annotation
/* .line 134 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/k/i0;->c()Landroid/database/sqlite/SQLiteDatabase;
/* .line 135 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).beginTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
/* .line 136 */
try { // :try_start_0
/* .line 137 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).setTransactionSuccessful ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 138 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).endTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
/* :catchall_0 */
/* move-exception p1 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).endTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
/* .line 139 */
/* throw p1 */
} // .end method
public final java.lang.Object a ( e.f.a.a.j.j0.k.h0 p0, e.f.a.a.j.j0.k.f0 p1 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/a/j/j0/k/h0<", */
/* "TT;>;", */
/* "Le/f/a/a/j/j0/k/f0<", */
/* "Ljava/lang/Throwable;", */
/* "TT;>;)TT;" */
/* } */
} // .end annotation
/* .line 121 */
v0 = this.d;
/* move-result-wide v0 */
/* .line 122 */
} // :goto_0
try { // :try_start_0
/* :try_end_0 */
/* .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v2 */
/* .line 123 */
v3 = this.d;
/* move-result-wide v3 */
v5 = this.e;
v5 = (( e.f.a.a.j.j0.k.g ) v5 ).a ( ); // invoke-virtual {v5}, Le/f/a/a/j/j0/k/g;->a()I
/* int-to-long v5, v5 */
/* add-long/2addr v5, v0 */
/* cmp-long v7, v3, v5 */
/* if-ltz v7, :cond_0 */
/* .line 124 */
} // :cond_0
/* const-wide/16 v2, 0x32 */
/* .line 125 */
android.os.SystemClock .sleep ( v2,v3 );
} // .end method
public java.lang.Object a ( Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(", */
/* "Le/f/a/a/j/k0/a<", */
/* "TT;>;)TT;" */
/* } */
} // .end annotation
/* .line 128 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/k/i0;->c()Landroid/database/sqlite/SQLiteDatabase;
/* .line 129 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/a/j/j0/k/i0;->a(Landroid/database/sqlite/SQLiteDatabase;)V
/* .line 130 */
try { // :try_start_0
/* .line 131 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).setTransactionSuccessful ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 132 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).endTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
/* :catchall_0 */
/* move-exception p1 */
(( android.database.sqlite.SQLiteDatabase ) v0 ).endTransaction ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
/* .line 133 */
/* throw p1 */
} // .end method
public final java.util.List a ( java.util.List p0, java.util.Map p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/f/a/a/j/j0/k/l;", */
/* ">;", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/Long;", */
/* "Ljava/util/Set<", */
/* "Le/f/a/a/j/j0/k/g0;", */
/* ">;>;)", */
/* "Ljava/util/List<", */
/* "Le/f/a/a/j/j0/k/l;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 112 */
/* .line 113 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 114 */
/* check-cast v1, Le/f/a/a/j/j0/k/l; */
/* .line 115 */
(( e.f.a.a.j.j0.k.l ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/a/a/j/j0/k/l;->b()J
/* move-result-wide v2 */
v2 = java.lang.Long .valueOf ( v2,v3 );
/* if-nez v2, :cond_0 */
/* .line 116 */
} // :cond_0
(( e.f.a.a.j.j0.k.l ) v1 ).a ( ); // invoke-virtual {v1}, Le/f/a/a/j/j0/k/l;->a()Le/f/a/a/j/q;
(( e.f.a.a.j.q ) v2 ).h ( ); // invoke-virtual {v2}, Le/f/a/a/j/q;->h()Le/f/a/a/j/p;
/* .line 117 */
(( e.f.a.a.j.j0.k.l ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/a/a/j/j0/k/l;->b()J
/* move-result-wide v3 */
java.lang.Long .valueOf ( v3,v4 );
/* check-cast v3, Ljava/util/Set; */
v4 = } // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_1
/* check-cast v4, Le/f/a/a/j/j0/k/g0; */
/* .line 118 */
v5 = this.a;
v4 = this.b;
(( e.f.a.a.j.p ) v2 ).a ( v5, v4 ); // invoke-virtual {v2, v5, v4}, Le/f/a/a/j/p;->a(Ljava/lang/String;Ljava/lang/String;)Le/f/a/a/j/p;
/* .line 119 */
} // :cond_1
(( e.f.a.a.j.j0.k.l ) v1 ).b ( ); // invoke-virtual {v1}, Le/f/a/a/j/j0/k/l;->b()J
/* move-result-wide v3 */
(( e.f.a.a.j.j0.k.l ) v1 ).c ( ); // invoke-virtual {v1}, Le/f/a/a/j/j0/k/l;->c()Le/f/a/a/j/x;
(( e.f.a.a.j.p ) v2 ).a ( ); // invoke-virtual {v2}, Le/f/a/a/j/p;->a()Le/f/a/a/j/q;
e.f.a.a.j.j0.k.l .a ( v3,v4,v1,v2 );
/* .line 120 */
} // :cond_2
} // .end method
public final java.util.Map a ( android.database.sqlite.SQLiteDatabase p0, java.util.List p1 ) {
/* .locals 12 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/database/sqlite/SQLiteDatabase;", */
/* "Ljava/util/List<", */
/* "Le/f/a/a/j/j0/k/l;", */
/* ">;)", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/Long;", */
/* "Ljava/util/Set<", */
/* "Le/f/a/a/j/j0/k/g0;", */
/* ">;>;" */
/* } */
} // .end annotation
/* .line 95 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 96 */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "event_id IN ("; // const-string v2, "event_id IN ("
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
int v2 = 0; // const/4 v2, 0x0
/* .line 97 */
v3 = } // :goto_0
/* if-ge v2, v3, :cond_1 */
/* .line 98 */
/* check-cast v3, Le/f/a/a/j/j0/k/l; */
(( e.f.a.a.j.j0.k.l ) v3 ).b ( ); // invoke-virtual {v3}, Le/f/a/a/j/j0/k/l;->b()J
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v1 ).append ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
v3 = /* .line 99 */
/* add-int/lit8 v3, v3, -0x1 */
/* if-ge v2, v3, :cond_0 */
/* const/16 v3, 0x2c */
/* .line 100 */
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // :cond_0
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
/* const/16 p2, 0x29 */
/* .line 101 */
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
final String p2 = "event_id"; // const-string p2, "event_id"
final String v2 = "name"; // const-string v2, "name"
final String v3 = "value"; // const-string v3, "value"
/* .line 102 */
/* filled-new-array {p2, v2, v3}, [Ljava/lang/String; */
/* .line 103 */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
int v11 = 0; // const/4 v11, 0x0
final String v5 = "event_metadata"; // const-string v5, "event_metadata"
/* move-object v4, p1 */
/* .line 104 */
/* invoke-virtual/range {v4 ..v11}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
e.f.a.a.j.j0.k.s .a ( v0 );
/* .line 105 */
e.f.a.a.j.j0.k.i0 .a ( p1,p2 );
} // .end method
public final void a ( android.database.sqlite.SQLiteDatabase p0 ) {
/* .locals 1 */
/* .line 126 */
e.f.a.a.j.j0.k.t .a ( p1 );
e.f.a.a.j.j0.k.u .a ( );
(( e.f.a.a.j.j0.k.i0 ) p0 ).a ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Le/f/a/a/j/j0/k/i0;->a(Le/f/a/a/j/j0/k/h0;Le/f/a/a/j/j0/k/f0;)Ljava/lang/Object;
return;
} // .end method
public void a ( Object p0, Long p1 ) {
/* .locals 0 */
/* .line 69 */
e.f.a.a.j.j0.k.m .a ( p2,p3,p1 );
(( e.f.a.a.j.j0.k.i0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/a/j/j0/k/i0;->a(Le/f/a/a/j/j0/k/f0;)Ljava/lang/Object;
return;
} // .end method
public void a ( java.lang.Iterable p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Iterable<", */
/* "Le/f/a/a/j/j0/k/l;", */
/* ">;)V" */
/* } */
} // .end annotation
v0 = /* .line 52 */
/* if-nez v0, :cond_0 */
return;
/* .line 53 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "DELETE FROM events WHERE _id in "; // const-string v1, "DELETE FROM events WHERE _id in "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
e.f.a.a.j.j0.k.i0 .c ( p1 );
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 54 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/k/i0;->c()Landroid/database/sqlite/SQLiteDatabase;
(( android.database.sqlite.SQLiteDatabase ) v0 ).compileStatement ( p1 ); // invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
(( android.database.sqlite.SQLiteStatement ) p1 ).execute ( ); // invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->execute()V
return;
} // .end method
public final java.lang.Long b ( android.database.sqlite.SQLiteDatabase p0, Object p1 ) {
/* .locals 13 */
/* .line 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "backend_name = ? and priority = ?"; // const-string v1, "backend_name = ? and priority = ?"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 3 */
/* new-instance v1, Ljava/util/ArrayList; */
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/String; */
/* .line 4 */
(( e.f.a.a.j.x ) p2 ).a ( ); // invoke-virtual {p2}, Le/f/a/a/j/x;->a()Ljava/lang/String;
int v4 = 0; // const/4 v4, 0x0
/* aput-object v3, v2, v4 */
/* .line 5 */
(( e.f.a.a.j.x ) p2 ).c ( ); // invoke-virtual {p2}, Le/f/a/a/j/x;->c()Le/f/a/a/d;
v3 = e.f.a.a.j.m0.a .a ( v3 );
java.lang.String .valueOf ( v3 );
int v5 = 1; // const/4 v5, 0x1
/* aput-object v3, v2, v5 */
/* .line 6 */
java.util.Arrays .asList ( v2 );
/* invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 7 */
(( e.f.a.a.j.x ) p2 ).b ( ); // invoke-virtual {p2}, Le/f/a/a/j/x;->b()[B
if ( v2 != null) { // if-eqz v2, :cond_0
final String v2 = " and extras = ?"; // const-string v2, " and extras = ?"
/* .line 8 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 9 */
(( e.f.a.a.j.x ) p2 ).b ( ); // invoke-virtual {p2}, Le/f/a/a/j/x;->b()[B
android.util.Base64 .encodeToString ( p2,v4 );
(( java.util.ArrayList ) v1 ).add ( p2 ); // invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
final String p2 = "_id"; // const-string p2, "_id"
/* .line 10 */
/* filled-new-array {p2}, [Ljava/lang/String; */
/* .line 11 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-array p2, v4, [Ljava/lang/String; */
/* .line 12 */
(( java.util.ArrayList ) v1 ).toArray ( p2 ); // invoke-virtual {v1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* move-object v9, p2 */
/* check-cast v9, [Ljava/lang/String; */
int v10 = 0; // const/4 v10, 0x0
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
final String v6 = "transport_contexts"; // const-string v6, "transport_contexts"
/* move-object v5, p1 */
/* .line 13 */
/* invoke-virtual/range {v5 ..v12}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
e.f.a.a.j.j0.k.a0 .a ( );
/* .line 14 */
e.f.a.a.j.j0.k.i0 .a ( p1,p2 );
/* check-cast p1, Ljava/lang/Long; */
} // .end method
public void b ( java.lang.Iterable p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Iterable<", */
/* "Le/f/a/a/j/j0/k/l;", */
/* ">;)V" */
/* } */
} // .end annotation
v0 = /* .line 17 */
/* if-nez v0, :cond_0 */
return;
/* .line 18 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in "; // const-string v1, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 19 */
e.f.a.a.j.j0.k.i0 .c ( p1 );
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 20 */
e.f.a.a.j.j0.k.b0 .a ( p1 );
(( e.f.a.a.j.j0.k.i0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/a/j/j0/k/i0;->a(Le/f/a/a/j/j0/k/f0;)Ljava/lang/Object;
return;
} // .end method
public Boolean b ( Object p0 ) {
/* .locals 0 */
/* .line 21 */
e.f.a.a.j.j0.k.d0 .a ( p0,p1 );
(( e.f.a.a.j.j0.k.i0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/a/j/j0/k/i0;->a(Le/f/a/a/j/j0/k/f0;)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Boolean; */
p1 = (( java.lang.Boolean ) p1 ).booleanValue ( ); // invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
} // .end method
public android.database.sqlite.SQLiteDatabase c ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.b;
/* .line 2 */
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
e.f.a.a.j.j0.k.v .a ( v0 );
e.f.a.a.j.j0.k.y .a ( );
/* .line 3 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Le/f/a/a/j/j0/k/i0;->a(Le/f/a/a/j/j0/k/h0;Le/f/a/a/j/j0/k/f0;)Ljava/lang/Object;
/* check-cast v0, Landroid/database/sqlite/SQLiteDatabase; */
} // .end method
public java.lang.Iterable c ( Object p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/f/a/a/j/x;", */
/* ")", */
/* "Ljava/lang/Iterable<", */
/* "Le/f/a/a/j/j0/k/l;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 12 */
e.f.a.a.j.j0.k.n .a ( p0,p1 );
(( e.f.a.a.j.j0.k.i0 ) p0 ).a ( p1 ); // invoke-virtual {p0, p1}, Le/f/a/a/j/j0/k/i0;->a(Le/f/a/a/j/j0/k/f0;)Ljava/lang/Object;
/* check-cast p1, Ljava/lang/Iterable; */
} // .end method
public final java.util.List c ( android.database.sqlite.SQLiteDatabase p0, Object p1 ) {
/* .locals 20 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/database/sqlite/SQLiteDatabase;", */
/* "Le/f/a/a/j/x;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Le/f/a/a/j/j0/k/l;", */
/* ">;" */
/* } */
} // .end annotation
/* move-object/from16 v0, p0 */
/* .line 23 */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 24 */
/* invoke-virtual/range {p0 ..p2}, Le/f/a/a/j/j0/k/i0;->b(Landroid/database/sqlite/SQLiteDatabase;Le/f/a/a/j/x;)Ljava/lang/Long; */
/* if-nez v2, :cond_0 */
} // :cond_0
final String v3 = "_id"; // const-string v3, "_id"
final String v4 = "transport_name"; // const-string v4, "transport_name"
final String v5 = "timestamp_ms"; // const-string v5, "timestamp_ms"
final String v6 = "uptime_ms"; // const-string v6, "uptime_ms"
final String v7 = "payload_encoding"; // const-string v7, "payload_encoding"
final String v8 = "payload"; // const-string v8, "payload"
final String v9 = "code"; // const-string v9, "code"
final String v10 = "inline"; // const-string v10, "inline"
/* .line 25 */
/* filled-new-array/range {v3 ..v10}, [Ljava/lang/String; */
int v3 = 1; // const/4 v3, 0x1
/* new-array v15, v3, [Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
/* .line 26 */
(( java.lang.Long ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/Long;->toString()Ljava/lang/String;
/* aput-object v2, v15, v3 */
/* const/16 v16, 0x0 */
/* const/16 v17, 0x0 */
/* const/16 v18, 0x0 */
v2 = this.e;
/* .line 27 */
v2 = (( e.f.a.a.j.j0.k.g ) v2 ).c ( ); // invoke-virtual {v2}, Le/f/a/a/j/j0/k/g;->c()I
java.lang.String .valueOf ( v2 );
final String v12 = "events"; // const-string v12, "events"
final String v14 = "context_id = ?"; // const-string v14, "context_id = ?"
/* move-object/from16 v11, p1 */
/* .line 28 */
/* invoke-virtual/range {v11 ..v19}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
/* move-object/from16 v3, p2 */
e.f.a.a.j.j0.k.q .a ( v0,v1,v3 );
/* .line 29 */
e.f.a.a.j.j0.k.i0 .a ( v2,v3 );
} // .end method
public void close ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
(( android.database.sqlite.SQLiteOpenHelper ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V
return;
} // .end method
public Integer d ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.c;
/* move-result-wide v0 */
v2 = this.e;
(( e.f.a.a.j.j0.k.g ) v2 ).b ( ); // invoke-virtual {v2}, Le/f/a/a/j/j0/k/g;->b()J
/* move-result-wide v2 */
/* sub-long/2addr v0, v2 */
/* .line 2 */
e.f.a.a.j.j0.k.p .a ( v0,v1 );
(( e.f.a.a.j.j0.k.i0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/a/j/j0/k/i0;->a(Le/f/a/a/j/j0/k/f0;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
} // .end method
public final g ( Long p0 ) {
/* .locals 8 */
/* .line 1 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/k/i0;->c()Landroid/database/sqlite/SQLiteDatabase;
final String v1 = "bytes"; // const-string v1, "bytes"
/* filled-new-array {v1}, [Ljava/lang/String; */
int v1 = 1; // const/4 v1, 0x1
/* new-array v4, v1, [Ljava/lang/String; */
/* .line 2 */
java.lang.String .valueOf ( p1,p2 );
int p2 = 0; // const/4 p2, 0x0
/* aput-object p1, v4, p2 */
final String v1 = "event_payloads"; // const-string v1, "event_payloads"
final String v3 = "event_id = ?"; // const-string v3, "event_id = ?"
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
final String v7 = "sequence_num"; // const-string v7, "sequence_num"
/* .line 3 */
/* invoke-virtual/range {v0 ..v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
e.f.a.a.j.j0.k.r .a ( );
/* .line 4 */
e.f.a.a.j.j0.k.i0 .a ( p1,p2 );
/* check-cast p1, [B */
} // .end method
public java.lang.Iterable k ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/lang/Iterable<", */
/* "Le/f/a/a/j/x;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
e.f.a.a.j.j0.k.o .a ( );
(( e.f.a.a.j.j0.k.i0 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Le/f/a/a/j/j0/k/i0;->a(Le/f/a/a/j/j0/k/f0;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Iterable; */
} // .end method
public final Long l ( ) {
/* .locals 2 */
/* .line 1 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/k/i0;->c()Landroid/database/sqlite/SQLiteDatabase;
final String v1 = "PRAGMA page_count"; // const-string v1, "PRAGMA page_count"
(( android.database.sqlite.SQLiteDatabase ) v0 ).compileStatement ( v1 ); // invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
(( android.database.sqlite.SQLiteStatement ) v0 ).simpleQueryForLong ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public final Long m ( ) {
/* .locals 2 */
/* .line 1 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).c ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/k/i0;->c()Landroid/database/sqlite/SQLiteDatabase;
final String v1 = "PRAGMA page_size"; // const-string v1, "PRAGMA page_size"
(( android.database.sqlite.SQLiteDatabase ) v0 ).compileStatement ( v1 ); // invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;
(( android.database.sqlite.SQLiteStatement ) v0 ).simpleQueryForLong ( ); // invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public final Boolean n ( ) {
/* .locals 5 */
/* .line 1 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).l ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/k/i0;->l()J
/* move-result-wide v0 */
(( e.f.a.a.j.j0.k.i0 ) p0 ).m ( ); // invoke-virtual {p0}, Le/f/a/a/j/j0/k/i0;->m()J
/* move-result-wide v2 */
/* mul-long v0, v0, v2 */
/* .line 2 */
v2 = this.e;
(( e.f.a.a.j.j0.k.g ) v2 ).e ( ); // invoke-virtual {v2}, Le/f/a/a/j/j0/k/g;->e()J
/* move-result-wide v2 */
/* cmp-long v4, v0, v2 */
/* if-ltz v4, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
