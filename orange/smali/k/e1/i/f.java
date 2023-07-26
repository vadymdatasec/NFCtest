public abstract class k.e1.i.f {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final java.lang.ThreadLocal a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ThreadLocal<", */
	 /* "Ljava/text/DateFormat;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static final java.lang.String b;
public static final java.text.DateFormat c;
/* # direct methods */
public static k.e1.i.f ( ) {
/* .locals 16 */
/* .line 1 */
/* new-instance v0, Lk/e1/i/e; */
/* invoke-direct {v0}, Lk/e1/i/e;-><init>()V */
final String v1 = "EEE, dd MMM yyyy HH:mm:ss zzz"; // const-string v1, "EEE, dd MMM yyyy HH:mm:ss zzz"
final String v2 = "EEEE, dd-MMM-yy HH:mm:ss zzz"; // const-string v2, "EEEE, dd-MMM-yy HH:mm:ss zzz"
final String v3 = "EEE MMM d HH:mm:ss yyyy"; // const-string v3, "EEE MMM d HH:mm:ss yyyy"
final String v4 = "EEE, dd-MMM-yyyy HH:mm:ss z"; // const-string v4, "EEE, dd-MMM-yyyy HH:mm:ss z"
final String v5 = "EEE, dd-MMM-yyyy HH-mm-ss z"; // const-string v5, "EEE, dd-MMM-yyyy HH-mm-ss z"
final String v6 = "EEE, dd MMM yy HH:mm:ss z"; // const-string v6, "EEE, dd MMM yy HH:mm:ss z"
final String v7 = "EEE dd-MMM-yyyy HH:mm:ss z"; // const-string v7, "EEE dd-MMM-yyyy HH:mm:ss z"
final String v8 = "EEE dd MMM yyyy HH:mm:ss z"; // const-string v8, "EEE dd MMM yyyy HH:mm:ss z"
final String v9 = "EEE dd-MMM-yyyy HH-mm-ss z"; // const-string v9, "EEE dd-MMM-yyyy HH-mm-ss z"
final String v10 = "EEE dd-MMM-yy HH:mm:ss z"; // const-string v10, "EEE dd-MMM-yy HH:mm:ss z"
final String v11 = "EEE dd MMM yy HH:mm:ss z"; // const-string v11, "EEE dd MMM yy HH:mm:ss z"
final String v12 = "EEE,dd-MMM-yy HH:mm:ss z"; // const-string v12, "EEE,dd-MMM-yy HH:mm:ss z"
final String v13 = "EEE,dd-MMM-yyyy HH:mm:ss z"; // const-string v13, "EEE,dd-MMM-yyyy HH:mm:ss z"
final String v14 = "EEE, dd-MM-yyyy HH:mm:ss z"; // const-string v14, "EEE, dd-MM-yyyy HH:mm:ss z"
final String v15 = "EEE MMM d yyyy HH:mm:ss z"; // const-string v15, "EEE MMM d yyyy HH:mm:ss z"
/* .line 2 */
/* filled-new-array/range {v1 ..v15}, [Ljava/lang/String; */
/* .line 3 */
/* array-length v0, v0 */
/* new-array v0, v0, [Ljava/text/DateFormat; */
return;
} // .end method
public static java.lang.String a ( java.util.Date p0 ) {
/* .locals 1 */
/* .line 16 */
v0 = k.e1.i.f.a;
(( java.lang.ThreadLocal ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
/* check-cast v0, Ljava/text/DateFormat; */
(( java.text.DateFormat ) v0 ).format ( p0 ); // invoke-virtual {v0, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
} // .end method
public static java.util.Date a ( java.lang.String p0 ) {
/* .locals 9 */
/* .line 1 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/text/ParsePosition; */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v2}, Ljava/text/ParsePosition;-><init>(I)V */
/* .line 3 */
v3 = k.e1.i.f.a;
(( java.lang.ThreadLocal ) v3 ).get ( ); // invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
/* check-cast v3, Ljava/text/DateFormat; */
(( java.text.DateFormat ) v3 ).parse ( p0, v0 ); // invoke-virtual {v3, p0, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
/* .line 4 */
v4 = (( java.text.ParsePosition ) v0 ).getIndex ( ); // invoke-virtual {v0}, Ljava/text/ParsePosition;->getIndex()I
v5 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-ne v4, v5, :cond_1 */
/* .line 5 */
} // :cond_1
v3 = k.e1.i.f.b;
/* monitor-enter v3 */
/* .line 6 */
try { // :try_start_0
v4 = k.e1.i.f.b;
/* array-length v4, v4 */
int v5 = 0; // const/4 v5, 0x0
} // :goto_0
/* if-ge v5, v4, :cond_4 */
/* .line 7 */
v6 = k.e1.i.f.c;
/* aget-object v6, v6, v5 */
/* if-nez v6, :cond_2 */
/* .line 8 */
/* new-instance v6, Ljava/text/SimpleDateFormat; */
v7 = k.e1.i.f.b;
/* aget-object v7, v7, v5 */
v8 = java.util.Locale.US;
/* invoke-direct {v6, v7, v8}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
/* .line 9 */
v7 = k.e1.e.n;
(( java.text.DateFormat ) v6 ).setTimeZone ( v7 ); // invoke-virtual {v6, v7}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V
/* .line 10 */
v7 = k.e1.i.f.c;
/* aput-object v6, v7, v5 */
/* .line 11 */
} // :cond_2
(( java.text.ParsePosition ) v0 ).setIndex ( v2 ); // invoke-virtual {v0, v2}, Ljava/text/ParsePosition;->setIndex(I)V
/* .line 12 */
(( java.text.DateFormat ) v6 ).parse ( p0, v0 ); // invoke-virtual {v6, p0, v0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;
/* .line 13 */
v7 = (( java.text.ParsePosition ) v0 ).getIndex ( ); // invoke-virtual {v0}, Ljava/text/ParsePosition;->getIndex()I
if ( v7 != null) { // if-eqz v7, :cond_3
/* .line 14 */
/* monitor-exit v3 */
} // :cond_3
/* add-int/lit8 v5, v5, 0x1 */
/* .line 15 */
} // :cond_4
/* monitor-exit v3 */
/* :catchall_0 */
/* move-exception p0 */
/* monitor-exit v3 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw p0 */
} // .end method
