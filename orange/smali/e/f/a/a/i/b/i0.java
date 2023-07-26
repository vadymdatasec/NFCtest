public abstract class e.f.a.a.i.b.i0 {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation build Lcom/google/auto/value/AutoValue; */
} // .end annotation
/* # direct methods */
public e.f.a.a.i.b.i0 ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static e.f.a.a.i.b.i0 a ( java.io.Reader p0 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
/* new-instance v0, Landroid/util/JsonReader; */
/* invoke-direct {v0, p0}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V */
/* .line 2 */
try { // :try_start_0
	 (( android.util.JsonReader ) v0 ).beginObject ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->beginObject()V
	 /* .line 3 */
} // :goto_0
p0 = (( android.util.JsonReader ) v0 ).hasNext ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->hasNext()Z
if ( p0 != null) { // if-eqz p0, :cond_2
	 /* .line 4 */
	 (( android.util.JsonReader ) v0 ).nextName ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 final String v1 = "nextRequestWaitMillis"; // const-string v1, "nextRequestWaitMillis"
	 /* .line 5 */
	 try { // :try_start_1
		 p0 = 		 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( p0 != null) { // if-eqz p0, :cond_1
			 /* .line 6 */
			 (( android.util.JsonReader ) v0 ).peek ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->peek()Landroid/util/JsonToken;
			 v1 = android.util.JsonToken.STRING;
			 /* if-ne p0, v1, :cond_0 */
			 /* .line 7 */
			 (( android.util.JsonReader ) v0 ).nextString ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
			 java.lang.Long .parseLong ( p0 );
			 /* move-result-wide v1 */
			 /* .line 8 */
			 /* new-instance p0, Le/f/a/a/i/b/w; */
			 /* invoke-direct {p0, v1, v2}, Le/f/a/a/i/b/w;-><init>(J)V */
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
			 /* .line 9 */
			 (( android.util.JsonReader ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
			 /* .line 10 */
		 } // :cond_0
		 try { // :try_start_2
			 (( android.util.JsonReader ) v0 ).nextLong ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->nextLong()J
			 /* move-result-wide v1 */
			 /* .line 11 */
			 /* new-instance p0, Le/f/a/a/i/b/w; */
			 /* invoke-direct {p0, v1, v2}, Le/f/a/a/i/b/w;-><init>(J)V */
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
			 /* .line 12 */
			 (( android.util.JsonReader ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
			 /* .line 13 */
		 } // :cond_1
		 try { // :try_start_3
			 (( android.util.JsonReader ) v0 ).skipValue ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->skipValue()V
			 /* .line 14 */
		 } // :cond_2
		 /* new-instance p0, Ljava/io/IOException; */
		 /* :try_end_3 */
		 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
		 final String v1 = "Response is missing nextRequestWaitMillis field."; // const-string v1, "Response is missing nextRequestWaitMillis field."
		 try { // :try_start_4
			 /* invoke-direct {p0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
			 /* throw p0 */
			 /* :try_end_4 */
			 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
			 /* :catchall_0 */
			 /* move-exception p0 */
			 /* .line 15 */
			 (( android.util.JsonReader ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
			 /* .line 16 */
			 /* throw p0 */
		 } // .end method
		 /* # virtual methods */
		 public abstract Long a ( ) {
		 } // .end method
