public abstract class e.a.a.c0.j {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static e.a.a.a a ( Object p0 ) {
		 /* .locals 17 */
		 /* move-object/from16 v0, p0 */
		 /* .line 1 */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v1 */
		 /* .line 2 */
		 v3 = this.c;
		 int v4 = 0; // const/4 v4, 0x0
		 /* if-nez v3, :cond_0 */
	 } // :cond_0
	 final String v5 = "Date"; // const-string v5, "Date"
	 /* .line 3 */
	 /* check-cast v5, Ljava/lang/String; */
	 if ( v5 != null) { // if-eqz v5, :cond_1
		 /* .line 4 */
		 e.a.a.c0.j .b ( v5 );
		 /* move-result-wide v8 */
	 } // :cond_1
	 /* const-wide/16 v8, 0x0 */
} // :goto_0
final String v5 = "Cache-Control"; // const-string v5, "Cache-Control"
/* .line 5 */
/* check-cast v5, Ljava/lang/String; */
int v11 = 0; // const/4 v11, 0x0
if ( v5 != null) { // if-eqz v5, :cond_9
	 final String v12 = ","; // const-string v12, ","
	 /* .line 6 */
	 (( java.lang.String ) v5 ).split ( v12, v11 ); // invoke-virtual {v5, v12, v11}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
	 int v12 = 0; // const/4 v12, 0x0
	 /* const-wide/16 v13, 0x0 */
	 /* const-wide/16 v15, 0x0 */
	 /* .line 7 */
} // :goto_1
/* array-length v10, v5 */
/* if-ge v11, v10, :cond_8 */
/* .line 8 */
/* aget-object v10, v5, v11 */
(( java.lang.String ) v10 ).trim ( ); // invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;
final String v6 = "no-cache"; // const-string v6, "no-cache"
/* .line 9 */
v6 = (( java.lang.String ) v10 ).equals ( v6 ); // invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v6, :cond_7 */
final String v6 = "no-store"; // const-string v6, "no-store"
v6 = (( java.lang.String ) v10 ).equals ( v6 ); // invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
} // :cond_2
final String v6 = "max-age="; // const-string v6, "max-age="
/* .line 10 */
v6 = (( java.lang.String ) v10 ).startsWith ( v6 ); // invoke-virtual {v10, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_3
	 /* const/16 v6, 0x8 */
	 /* .line 11 */
	 try { // :try_start_0
		 (( java.lang.String ) v10 ).substring ( v6 ); // invoke-virtual {v10, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;
		 java.lang.Long .parseLong ( v6 );
		 /* move-result-wide v13 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :cond_3
	 final String v6 = "stale-while-revalidate="; // const-string v6, "stale-while-revalidate="
	 /* .line 12 */
	 v6 = 	 (( java.lang.String ) v10 ).startsWith ( v6 ); // invoke-virtual {v10, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
	 if ( v6 != null) { // if-eqz v6, :cond_4
		 /* const/16 v6, 0x17 */
		 /* .line 13 */
		 try { // :try_start_1
			 (( java.lang.String ) v10 ).substring ( v6 ); // invoke-virtual {v10, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;
			 java.lang.Long .parseLong ( v6 );
			 /* move-result-wide v15 */
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
		 } // :cond_4
		 final String v6 = "must-revalidate"; // const-string v6, "must-revalidate"
		 /* .line 14 */
		 v6 = 		 (( java.lang.String ) v10 ).equals ( v6 ); // invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v6, :cond_5 */
		 final String v6 = "proxy-revalidate"; // const-string v6, "proxy-revalidate"
		 v6 = 		 (( java.lang.String ) v10 ).equals ( v6 ); // invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v6 != null) { // if-eqz v6, :cond_6
		 } // :cond_5
		 int v12 = 1; // const/4 v12, 0x1
		 /* :catch_0 */
	 } // :cond_6
} // :goto_2
/* add-int/lit8 v11, v11, 0x1 */
} // :cond_7
} // :goto_3
} // :cond_8
/* move v11, v12 */
int v10 = 1; // const/4 v10, 0x1
} // :cond_9
int v10 = 0; // const/4 v10, 0x0
/* const-wide/16 v13, 0x0 */
/* const-wide/16 v15, 0x0 */
} // :goto_4
final String v4 = "Expires"; // const-string v4, "Expires"
/* .line 15 */
/* check-cast v4, Ljava/lang/String; */
if ( v4 != null) { // if-eqz v4, :cond_a
/* .line 16 */
e.a.a.c0.j .b ( v4 );
/* move-result-wide v4 */
} // :cond_a
/* const-wide/16 v4, 0x0 */
} // :goto_5
final String v6 = "Last-Modified"; // const-string v6, "Last-Modified"
/* .line 17 */
/* check-cast v6, Ljava/lang/String; */
if ( v6 != null) { // if-eqz v6, :cond_b
/* .line 18 */
e.a.a.c0.j .b ( v6 );
/* move-result-wide v6 */
} // :cond_b
/* const-wide/16 v6, 0x0 */
} // :goto_6
final String v12 = "ETag"; // const-string v12, "ETag"
/* .line 19 */
/* check-cast v12, Ljava/lang/String; */
if ( v10 != null) { // if-eqz v10, :cond_d
/* const-wide/16 v4, 0x3e8 */
/* mul-long v13, v13, v4 */
/* add-long/2addr v1, v13 */
if ( v11 != null) { // if-eqz v11, :cond_c
/* move-wide v15, v1 */
/* .line 20 */
} // :cond_c
/* invoke-static/range {v15 ..v16}, Ljava/lang/Long;->signum(J)I */
/* mul-long v15, v15, v4 */
/* add-long/2addr v15, v1 */
} // :goto_7
/* move-wide v10, v15 */
} // :cond_d
/* const-wide/16 v10, 0x0 */
/* cmp-long v13, v8, v10 */
/* if-lez v13, :cond_e */
/* cmp-long v13, v4, v8 */
/* if-ltz v13, :cond_e */
/* sub-long/2addr v4, v8 */
/* add-long/2addr v1, v4 */
/* move-wide v10, v1 */
} // :cond_e
/* move-wide v1, v10 */
/* .line 21 */
} // :goto_8
/* new-instance v4, Le/a/a/a; */
/* invoke-direct {v4}, Le/a/a/a;-><init>()V */
/* .line 22 */
v5 = this.b;
this.a = v5;
/* .line 23 */
this.b = v12;
/* .line 24 */
/* iput-wide v1, v4, Le/a/a/a;->f:J */
/* .line 25 */
/* iput-wide v10, v4, Le/a/a/a;->e:J */
/* .line 26 */
/* iput-wide v8, v4, Le/a/a/a;->c:J */
/* .line 27 */
/* iput-wide v6, v4, Le/a/a/a;->d:J */
/* .line 28 */
this.g = v3;
/* .line 29 */
v0 = this.d;
this.h = v0;
} // .end method
public static java.lang.String a ( Long p0 ) {
/* .locals 2 */
final String v0 = "EEE, dd MMM yyyy HH:mm:ss \'GMT\'"; // const-string v0, "EEE, dd MMM yyyy HH:mm:ss \'GMT\'"
/* .line 30 */
e.a.a.c0.j .a ( v0 );
/* new-instance v1, Ljava/util/Date; */
/* invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V */
(( java.text.SimpleDateFormat ) v0 ).format ( v1 ); // invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
} // .end method
public static java.lang.String a ( java.util.Map p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
final String v0 = "ISO-8859-1"; // const-string v0, "ISO-8859-1"
/* .line 40 */
e.a.a.c0.j .a ( p0,v0 );
} // .end method
public static java.lang.String a ( java.util.Map p0, java.lang.String p1 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
} // :cond_0
final String v0 = "Content-Type"; // const-string v0, "Content-Type"
/* .line 33 */
/* check-cast p0, Ljava/lang/String; */
if ( p0 != null) { // if-eqz p0, :cond_2
int v0 = 0; // const/4 v0, 0x0
final String v1 = ";"; // const-string v1, ";"
/* .line 34 */
(( java.lang.String ) p0 ).split ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
int v2 = 1; // const/4 v2, 0x1
/* .line 35 */
} // :goto_0
/* array-length v3, p0 */
/* if-ge v2, v3, :cond_2 */
/* .line 36 */
/* aget-object v3, p0, v2 */
(( java.lang.String ) v3 ).trim ( ); // invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
final String v4 = "="; // const-string v4, "="
(( java.lang.String ) v3 ).split ( v4, v0 ); // invoke-virtual {v3, v4, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
/* .line 37 */
/* array-length v4, v3 */
int v5 = 2; // const/4 v5, 0x2
/* if-ne v4, v5, :cond_1 */
/* .line 38 */
/* aget-object v4, v3, v0 */
final String v5 = "charset"; // const-string v5, "charset"
v4 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 39 */
/* aget-object p0, v3, v1 */
} // :cond_1
/* add-int/lit8 v2, v2, 0x1 */
} // :cond_2
} // .end method
public static java.text.SimpleDateFormat a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 31 */
/* new-instance v0, Ljava/text/SimpleDateFormat; */
v1 = java.util.Locale.US;
/* invoke-direct {v0, p0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
final String p0 = "GMT"; // const-string p0, "GMT"
/* .line 32 */
java.util.TimeZone .getTimeZone ( p0 );
(( java.text.SimpleDateFormat ) v0 ).setTimeZone ( p0 ); // invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V
} // .end method
public static java.util.List a ( java.util.List p0, Object p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;", */
/* "Le/a/a/a;", */
/* ")", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 44 */
/* new-instance v0, Ljava/util/TreeSet; */
v1 = java.lang.String.CASE_INSENSITIVE_ORDER;
/* invoke-direct {v0, v1}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V */
v1 = /* .line 45 */
/* if-nez v1, :cond_0 */
/* .line 46 */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v2, Le/a/a/i; */
/* .line 47 */
(( e.a.a.i ) v2 ).a ( ); // invoke-virtual {v2}, Le/a/a/i;->a()Ljava/lang/String;
/* .line 48 */
} // :cond_0
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
/* .line 49 */
p0 = this.h;
if ( p0 != null) { // if-eqz p0, :cond_2
p0 = /* .line 50 */
/* if-nez p0, :cond_4 */
/* .line 51 */
p0 = this.h;
} // :cond_1
p1 = } // :goto_1
if ( p1 != null) { // if-eqz p1, :cond_4
/* check-cast p1, Le/a/a/i; */
/* .line 52 */
v2 = (( e.a.a.i ) p1 ).a ( ); // invoke-virtual {p1}, Le/a/a/i;->a()Ljava/lang/String;
/* if-nez v2, :cond_1 */
/* .line 53 */
/* .line 54 */
} // :cond_2
p0 = p0 = this.g;
/* if-nez p0, :cond_4 */
/* .line 55 */
p0 = this.g;
} // :cond_3
p1 = } // :goto_2
if ( p1 != null) { // if-eqz p1, :cond_4
/* check-cast p1, Ljava/util/Map$Entry; */
v2 = /* .line 56 */
/* if-nez v2, :cond_3 */
/* .line 57 */
/* new-instance v2, Le/a/a/i; */
/* check-cast v3, Ljava/lang/String; */
/* check-cast p1, Ljava/lang/String; */
/* invoke-direct {v2, v3, p1}, Le/a/a/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
} // :cond_4
} // .end method
public static java.util.Map a ( Object p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Le/a/a/a;", */
/* ")", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* if-nez p0, :cond_0 */
/* .line 58 */
java.util.Collections .emptyMap ( );
/* .line 59 */
} // :cond_0
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 60 */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_1
final String v2 = "If-None-Match"; // const-string v2, "If-None-Match"
/* .line 61 */
/* .line 62 */
} // :cond_1
/* iget-wide v1, p0, Le/a/a/a;->d:J */
/* const-wide/16 v3, 0x0 */
/* cmp-long p0, v1, v3 */
/* if-lez p0, :cond_2 */
/* .line 63 */
e.a.a.c0.j .a ( v1,v2 );
final String v1 = "If-Modified-Since"; // const-string v1, "If-Modified-Since"
/* .line 64 */
} // :cond_2
} // .end method
public static java.util.Map a ( java.util.List p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;)", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 41 */
/* new-instance v0, Ljava/util/TreeMap; */
v1 = java.lang.String.CASE_INSENSITIVE_ORDER;
/* invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V */
/* .line 42 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Le/a/a/i; */
/* .line 43 */
(( e.a.a.i ) v1 ).a ( ); // invoke-virtual {v1}, Le/a/a/i;->a()Ljava/lang/String;
(( e.a.a.i ) v1 ).b ( ); // invoke-virtual {v1}, Le/a/a/i;->b()Ljava/lang/String;
} // :cond_0
} // .end method
public static Long b ( java.lang.String p0 ) {
/* .locals 2 */
try { // :try_start_0
final String v0 = "EEE, dd MMM yyyy HH:mm:ss zzz"; // const-string v0, "EEE, dd MMM yyyy HH:mm:ss zzz"
/* .line 1 */
e.a.a.c0.j .a ( v0 );
(( java.text.SimpleDateFormat ) v0 ).parse ( p0 ); // invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
/* :try_end_0 */
/* .catch Ljava/text/ParseException; {:try_start_0 ..:try_end_0} :catch_0 */
/* return-wide v0 */
/* :catch_0 */
/* nop */
final String v0 = "0"; // const-string v0, "0"
/* .line 2 */
v0 = (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
final String v0 = "-1"; // const-string v0, "-1"
p0 = (( java.lang.String ) v0 ).equals ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // :cond_0
/* const-wide/16 v0, 0x0 */
/* return-wide v0 */
} // .end method
public static java.util.List b ( java.util.Map p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/util/List<", */
/* "Le/a/a/i;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 3 */
v1 = /* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 4 */
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 5 */
/* new-instance v2, Le/a/a/i; */
/* check-cast v3, Ljava/lang/String; */
/* check-cast v1, Ljava/lang/String; */
/* invoke-direct {v2, v3, v1}, Le/a/a/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
} // :cond_0
} // .end method
