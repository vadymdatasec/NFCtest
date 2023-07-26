public class c.b.k.a1 {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static c.b.k.a1 d;
	 /* # instance fields */
	 public final android.content.Context a;
	 public final android.location.LocationManager b;
	 public final c.b.k.z0 c;
	 /* # direct methods */
	 public c.b.k.a1 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lc/b/k/z0; */
		 /* invoke-direct {v0}, Lc/b/k/z0;-><init>()V */
		 this.c = v0;
		 /* .line 3 */
		 this.a = p1;
		 /* .line 4 */
		 this.b = p2;
		 return;
	 } // .end method
	 public static c.b.k.a1 a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = c.b.k.a1.d;
		 /* if-nez v0, :cond_0 */
		 /* .line 2 */
		 (( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
		 /* .line 3 */
		 /* new-instance v0, Lc/b/k/a1; */
		 final String v1 = "location"; // const-string v1, "location"
		 /* .line 4 */
		 (( android.content.Context ) p0 ).getSystemService ( v1 ); // invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v1, Landroid/location/LocationManager; */
		 /* invoke-direct {v0, p0, v1}, Lc/b/k/a1;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V */
		 /* .line 5 */
	 } // :cond_0
	 p0 = c.b.k.a1.d;
} // .end method
/* # virtual methods */
public final android.location.Location a ( ) {
	 /* .locals 7 */
	 /* .annotation build Landroid/annotation/SuppressLint; */
	 /* value = { */
	 /* "MissingPermission" */
	 /* } */
} // .end annotation
/* .line 6 */
v0 = this.a;
final String v1 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v1, "android.permission.ACCESS_COARSE_LOCATION"
v0 = c.h.f.h .a ( v0,v1 );
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
final String v0 = "network"; // const-string v0, "network"
/* .line 7 */
(( c.b.k.a1 ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lc/b/k/a1;->a(Ljava/lang/String;)Landroid/location/Location;
} // :cond_0
/* move-object v0, v1 */
/* .line 8 */
} // :goto_0
v2 = this.a;
final String v3 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v3, "android.permission.ACCESS_FINE_LOCATION"
v2 = c.h.f.h .a ( v2,v3 );
/* if-nez v2, :cond_1 */
final String v1 = "gps"; // const-string v1, "gps"
/* .line 9 */
(( c.b.k.a1 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lc/b/k/a1;->a(Ljava/lang/String;)Landroid/location/Location;
} // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_3
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 10 */
(( android.location.Location ) v1 ).getTime ( ); // invoke-virtual {v1}, Landroid/location/Location;->getTime()J
/* move-result-wide v2 */
(( android.location.Location ) v0 ).getTime ( ); // invoke-virtual {v0}, Landroid/location/Location;->getTime()J
/* move-result-wide v4 */
/* cmp-long v6, v2, v4 */
/* if-lez v6, :cond_2 */
/* move-object v0, v1 */
} // :cond_2
} // :cond_3
if ( v1 != null) { // if-eqz v1, :cond_4
/* move-object v0, v1 */
} // :cond_4
} // .end method
public final android.location.Location a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 11 */
try { // :try_start_0
v0 = this.b;
v0 = (( android.location.LocationManager ) v0 ).isProviderEnabled ( p1 ); // invoke-virtual {v0, p1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 12 */
v0 = this.b;
(( android.location.LocationManager ) v0 ).getLastKnownLocation ( p1 ); // invoke-virtual {v0, p1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
final String v0 = "TwilightManager"; // const-string v0, "TwilightManager"
final String v1 = "Failed to get last known location"; // const-string v1, "Failed to get last known location"
/* .line 13 */
android.util.Log .d ( v0,v1,p1 );
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public final void a ( android.location.Location p0 ) {
/* .locals 22 */
/* move-object/from16 v0, p0 */
/* .line 14 */
v1 = this.c;
/* .line 15 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v9 */
/* .line 16 */
c.b.k.y0 .a ( );
/* const-wide/32 v12, 0x5265c00 */
/* sub-long v3, v9, v12 */
/* .line 17 */
/* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getLatitude()D */
/* move-result-wide v5 */
/* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getLongitude()D */
/* move-result-wide v7 */
/* move-object v2, v11 */
/* .line 18 */
/* invoke-virtual/range {v2 ..v8}, Lc/b/k/y0;->a(JDD)V */
/* .line 19 */
/* iget-wide v14, v11, Lc/b/k/y0;->a:J */
/* .line 20 */
/* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getLatitude()D */
/* move-result-wide v5 */
/* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getLongitude()D */
/* move-result-wide v7 */
/* move-wide v3, v9 */
/* invoke-virtual/range {v2 ..v8}, Lc/b/k/y0;->a(JDD)V */
/* .line 21 */
/* iget v2, v11, Lc/b/k/y0;->c:I */
int v3 = 1; // const/4 v3, 0x1
/* if-ne v2, v3, :cond_0 */
int v7 = 1; // const/4 v7, 0x1
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
int v7 = 0; // const/4 v7, 0x0
/* .line 22 */
} // :goto_0
/* iget-wide v5, v11, Lc/b/k/y0;->b:J */
/* .line 23 */
/* iget-wide v3, v11, Lc/b/k/y0;->a:J */
/* add-long/2addr v12, v9 */
/* .line 24 */
/* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getLatitude()D */
/* move-result-wide v16 */
/* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getLongitude()D */
/* move-result-wide v18 */
/* move-object v2, v11 */
/* move-wide/from16 v20, v14 */
/* move-wide v14, v3 */
/* move-wide v3, v12 */
/* move-wide v12, v5 */
/* move-wide/from16 v5, v16 */
/* move v0, v7 */
/* move-wide/from16 v7, v18 */
/* .line 25 */
/* invoke-virtual/range {v2 ..v8}, Lc/b/k/y0;->a(JDD)V */
/* .line 26 */
/* iget-wide v2, v11, Lc/b/k/y0;->b:J */
/* const-wide/16 v4, 0x0 */
/* const-wide/16 v6, -0x1 */
/* cmp-long v8, v12, v6 */
if ( v8 != null) { // if-eqz v8, :cond_4
/* cmp-long v8, v14, v6 */
/* if-nez v8, :cond_1 */
} // :cond_1
/* cmp-long v6, v9, v14 */
/* if-lez v6, :cond_2 */
/* add-long/2addr v4, v2 */
} // :cond_2
/* cmp-long v6, v9, v12 */
/* if-lez v6, :cond_3 */
/* add-long/2addr v4, v14 */
} // :cond_3
/* add-long/2addr v4, v12 */
} // :goto_1
/* const-wide/32 v6, 0xea60 */
/* add-long/2addr v4, v6 */
} // :cond_4
} // :goto_2
/* const-wide/32 v4, 0x2932e00 */
/* add-long/2addr v4, v9 */
/* .line 27 */
} // :goto_3
/* iput-boolean v0, v1, Lc/b/k/z0;->a:Z */
/* move-wide/from16 v6, v20 */
/* .line 28 */
/* iput-wide v6, v1, Lc/b/k/z0;->b:J */
/* .line 29 */
/* iput-wide v12, v1, Lc/b/k/z0;->c:J */
/* .line 30 */
/* iput-wide v14, v1, Lc/b/k/z0;->d:J */
/* .line 31 */
/* iput-wide v2, v1, Lc/b/k/z0;->e:J */
/* .line 32 */
/* iput-wide v4, v1, Lc/b/k/z0;->f:J */
return;
} // .end method
public Boolean b ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.c;
/* .line 2 */
v1 = (( c.b.k.a1 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/b/k/a1;->c()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 3 */
/* iget-boolean v0, v0, Lc/b/k/z0;->a:Z */
/* .line 4 */
} // :cond_0
(( c.b.k.a1 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/b/k/a1;->a()Landroid/location/Location;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 5 */
(( c.b.k.a1 ) p0 ).a ( v1 ); // invoke-virtual {p0, v1}, Lc/b/k/a1;->a(Landroid/location/Location;)V
/* .line 6 */
/* iget-boolean v0, v0, Lc/b/k/z0;->a:Z */
} // :cond_1
final String v0 = "TwilightManager"; // const-string v0, "TwilightManager"
final String v1 = "Could not get last known location.This is probably because the app does not have any location permissions.Falling back to hardcoded sunrise/sunset values."; // const-string v1, "Could not get last known location.This is probably because the app does not have any location permissions.Falling back to hardcoded sunrise/sunset values."
/* .line 7 */
android.util.Log .i ( v0,v1 );
/* .line 8 */
java.util.Calendar .getInstance ( );
/* const/16 v1, 0xb */
/* .line 9 */
v0 = (( java.util.Calendar ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I
int v1 = 6; // const/4 v1, 0x6
/* if-lt v0, v1, :cond_3 */
/* const/16 v1, 0x16 */
/* if-lt v0, v1, :cond_2 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :cond_3
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public final Boolean c ( ) {
/* .locals 5 */
/* .line 1 */
v0 = this.c;
/* iget-wide v0, v0, Lc/b/k/z0;->f:J */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* cmp-long v4, v0, v2 */
/* if-lez v4, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
