public abstract class e.f.a.d.a.e.m {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static void a ( android.content.pm.PackageManager p0, android.content.ComponentName p1, Integer p2 ) {
		 /* .locals 10 */
		 v0 = 		 (( android.content.pm.PackageManager ) p0 ).getComponentEnabledSetting ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-eq v0, v1, :cond_6 */
		 int v2 = 2; // const/4 v2, 0x2
		 /* if-eq v0, v2, :cond_5 */
		 (( android.content.ComponentName ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
		 (( android.content.ComponentName ) p1 ).getClassName ( ); // invoke-virtual {p1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;
		 /* or-int/lit16 p2, p2, 0x200 */
		 try { // :try_start_0
			 (( android.content.pm.PackageManager ) p0 ).getPackageInfo ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
			 int v0 = 3; // const/4 v0, 0x3
			 /* new-array v4, v0, [[Landroid/content/pm/ComponentInfo; */
			 v5 = this.activities;
			 int v6 = 0; // const/4 v6, 0x0
			 /* aput-object v5, v4, v6 */
			 v5 = this.services;
			 /* aput-object v5, v4, v1 */
			 p2 = this.providers;
			 /* aput-object p2, v4, v2 */
			 int p2 = 0; // const/4 p2, 0x0
		 } // :goto_0
		 /* if-ge p2, v0, :cond_3 */
		 /* aget-object v2, v4, p2 */
		 /* if-nez v2, :cond_0 */
	 } // :cond_0
	 /* array-length v5, v2 */
	 int v7 = 0; // const/4 v7, 0x0
} // :goto_1
/* if-ge v7, v5, :cond_2 */
/* aget-object v8, v2, v7 */
v9 = this.name;
v9 = (( java.lang.String ) v9 ).equals ( v3 ); // invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_1
} // :cond_1
/* add-int/lit8 v7, v7, 0x1 */
} // :cond_2
} // :goto_2
/* add-int/lit8 p2, p2, 0x1 */
} // :cond_3
int v8 = 0; // const/4 v8, 0x0
} // :goto_3
/* if-nez v8, :cond_4 */
} // :cond_4
p2 = (( android.content.pm.ComponentInfo ) v8 ).isEnabled ( ); // invoke-virtual {v8}, Landroid/content/pm/ComponentInfo;->isEnabled()Z
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
if ( p2 != null) { // if-eqz p2, :cond_5
/* :catch_0 */
} // :cond_5
} // :goto_4
(( android.content.pm.PackageManager ) p0 ).setComponentEnabledSetting ( p1, v1, v1 ); // invoke-virtual {p0, p1, v1, v1}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V
} // :cond_6
} // :goto_5
return;
} // .end method
public static void a ( Object p0, java.io.InputStream p1, java.io.OutputStream p2, Long p3 ) {
/* .locals 13 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* const/16 v0, 0x4000 */
/* new-array v0, v0, [B */
/* new-instance v1, Ljava/io/BufferedInputStream; */
/* const/16 v2, 0x1000 */
/* move-object v3, p1 */
/* invoke-direct {v1, p1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V */
/* new-instance v9, Ljava/io/DataInputStream; */
/* invoke-direct {v9, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
v1 = (( java.io.DataInputStream ) v9 ).readInt ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I
/* const v2, -0x2e002e01 */
/* if-eq v1, v2, :cond_1 */
/* new-instance v0, Lcom/google/android/play/core/internal/ca; */
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
java.lang.Integer .valueOf ( v1 );
/* aput-object v1, v2, v3 */
final String v1 = "%x"; // const-string v1, "%x"
java.lang.String .format ( v1,v2 );
java.lang.String .valueOf ( v1 );
final String v2 = "Unexpected magic="; // const-string v2, "Unexpected magic="
v3 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
if ( v3 != null) { // if-eqz v3, :cond_0
(( java.lang.String ) v2 ).concat ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
} // :cond_0
/* new-instance v1, Ljava/lang/String; */
/* invoke-direct {v1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V */
} // :goto_0
/* invoke-direct {v0, v1}, Lcom/google/android/play/core/internal/ca;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
v1 = (( java.io.DataInputStream ) v9 ).read ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->read()I
int v2 = 4; // const/4 v2, 0x4
/* if-ne v1, v2, :cond_6 */
/* const-wide/16 v1, 0x0 */
/* move-wide v10, v1 */
} // :goto_1
/* sub-long v7, p3, v10 */
try { // :try_start_0
v12 = (( java.io.DataInputStream ) v9 ).read ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->read()I
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v12, v1, :cond_5 */
if ( v12 != null) { // if-eqz v12, :cond_4
final String v2 = "Unexpected end of patch"; // const-string v2, "Unexpected end of patch"
/* packed-switch v12, :pswitch_data_0 */
/* move-object v1, v0 */
/* move-object v2, v9 */
/* move-object v3, p2 */
/* move v4, v12 */
/* move-wide v5, v7 */
try { // :try_start_1
/* invoke-static/range {v1 ..v6}, Le/f/a/d/a/e/m;->a([BLjava/io/DataInputStream;Ljava/io/OutputStream;IJ)V */
/* goto/16 :goto_2 */
/* :pswitch_0 */
(( java.io.DataInputStream ) v9 ).readLong ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v4 */
v12 = (( java.io.DataInputStream ) v9 ).readInt ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I
/* move-object v1, v0 */
/* move-object v2, p0 */
/* move-object v3, p2 */
/* move v6, v12 */
/* invoke-static/range {v1 ..v8}, Le/f/a/d/a/e/m;->a([BLe/f/a/d/a/e/o;Ljava/io/OutputStream;JIJ)V */
/* goto/16 :goto_2 */
/* :pswitch_1 */
v1 = (( java.io.DataInputStream ) v9 ).readInt ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I
/* int-to-long v4, v1 */
v12 = (( java.io.DataInputStream ) v9 ).readInt ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I
/* move-object v1, v0 */
/* move-object v2, p0 */
/* move-object v3, p2 */
/* move v6, v12 */
/* invoke-static/range {v1 ..v8}, Le/f/a/d/a/e/m;->a([BLe/f/a/d/a/e/o;Ljava/io/OutputStream;JIJ)V */
/* goto/16 :goto_2 */
/* :pswitch_2 */
v1 = (( java.io.DataInputStream ) v9 ).readInt ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I
/* int-to-long v4, v1 */
v12 = (( java.io.DataInputStream ) v9 ).readUnsignedShort ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* move-object v1, v0 */
/* move-object v2, p0 */
/* move-object v3, p2 */
/* move v6, v12 */
/* invoke-static/range {v1 ..v8}, Le/f/a/d/a/e/m;->a([BLe/f/a/d/a/e/o;Ljava/io/OutputStream;JIJ)V */
/* goto/16 :goto_2 */
/* :pswitch_3 */
v3 = (( java.io.DataInputStream ) v9 ).readInt ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I
/* int-to-long v4, v3 */
v12 = (( java.io.DataInputStream ) v9 ).read ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->read()I
/* if-eq v12, v1, :cond_2 */
/* move-object v1, v0 */
/* move-object v2, p0 */
/* move-object v3, p2 */
/* move v6, v12 */
/* invoke-static/range {v1 ..v8}, Le/f/a/d/a/e/m;->a([BLe/f/a/d/a/e/o;Ljava/io/OutputStream;JIJ)V */
/* goto/16 :goto_2 */
} // :cond_2
/* new-instance v0, Ljava/io/IOException; */
/* invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :pswitch_4 */
v1 = (( java.io.DataInputStream ) v9 ).readUnsignedShort ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* int-to-long v4, v1 */
v12 = (( java.io.DataInputStream ) v9 ).readInt ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I
/* move-object v1, v0 */
/* move-object v2, p0 */
/* move-object v3, p2 */
/* move v6, v12 */
/* invoke-static/range {v1 ..v8}, Le/f/a/d/a/e/m;->a([BLe/f/a/d/a/e/o;Ljava/io/OutputStream;JIJ)V */
/* :pswitch_5 */
v1 = (( java.io.DataInputStream ) v9 ).readUnsignedShort ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* int-to-long v4, v1 */
v12 = (( java.io.DataInputStream ) v9 ).readUnsignedShort ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* move-object v1, v0 */
/* move-object v2, p0 */
/* move-object v3, p2 */
/* move v6, v12 */
/* invoke-static/range {v1 ..v8}, Le/f/a/d/a/e/m;->a([BLe/f/a/d/a/e/o;Ljava/io/OutputStream;JIJ)V */
/* :pswitch_6 */
v3 = (( java.io.DataInputStream ) v9 ).readUnsignedShort ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* int-to-long v4, v3 */
v12 = (( java.io.DataInputStream ) v9 ).read ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->read()I
/* if-eq v12, v1, :cond_3 */
/* move-object v1, v0 */
/* move-object v2, p0 */
/* move-object v3, p2 */
/* move v6, v12 */
/* invoke-static/range {v1 ..v8}, Le/f/a/d/a/e/m;->a([BLe/f/a/d/a/e/o;Ljava/io/OutputStream;JIJ)V */
} // :cond_3
/* new-instance v0, Ljava/io/IOException; */
/* invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :pswitch_7 */
v12 = (( java.io.DataInputStream ) v9 ).readInt ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readInt()I
/* move-object v1, v0 */
/* move-object v2, v9 */
/* move-object v3, p2 */
/* move v4, v12 */
/* move-wide v5, v7 */
/* invoke-static/range {v1 ..v6}, Le/f/a/d/a/e/m;->a([BLjava/io/DataInputStream;Ljava/io/OutputStream;IJ)V */
/* :pswitch_8 */
v12 = (( java.io.DataInputStream ) v9 ).readUnsignedShort ( ); // invoke-virtual {v9}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* move-object v1, v0 */
/* move-object v2, v9 */
/* move-object v3, p2 */
/* move v4, v12 */
/* move-wide v5, v7 */
/* invoke-static/range {v1 ..v6}, Le/f/a/d/a/e/m;->a([BLjava/io/DataInputStream;Ljava/io/OutputStream;IJ)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_2
/* int-to-long v1, v12 */
/* add-long/2addr v10, v1 */
/* goto/16 :goto_1 */
} // :cond_4
(( java.io.OutputStream ) p2 ).flush ( ); // invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V
return;
} // :cond_5
try { // :try_start_2
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Patch file overrun"; // const-string v1, "Patch file overrun"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
(( java.io.OutputStream ) p2 ).flush ( ); // invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V
/* throw v0 */
} // :cond_6
/* new-instance v0, Lcom/google/android/play/core/internal/ca; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* const/16 v3, 0x1e */
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v3 = "Unexpected version="; // const-string v3, "Unexpected version="
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Lcom/google/android/play/core/internal/ca;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0xf7 */
/* :pswitch_8 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static void a ( java.lang.Object p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(TT;)V" */
/* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
return;
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
/* throw p0 */
} // .end method
public static void a ( java.lang.Object p0, java.lang.Class p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(TT;", */
/* "Ljava/lang/Class<", */
/* "TT;>;)V" */
/* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
return;
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalStateException; */
(( java.lang.Class ) p1 ).getCanonicalName ( ); // invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;
java.lang.String .valueOf ( p1 );
final String v0 = " must be set"; // const-string v0, " must be set"
(( java.lang.String ) p1 ).concat ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( Object[] p0, Object p1, java.io.OutputStream p2, Long p3, Integer p4, Long p5 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* move-object v0, p0 */
/* move v1, p5 */
/* if-ltz v1, :cond_5 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v4, p3, v2 */
/* if-ltz v4, :cond_4 */
/* int-to-long v8, v1 */
/* cmp-long v2, v8, p6 */
/* if-gtz v2, :cond_3 */
try { // :try_start_0
/* new-instance v2, Le/f/a/d/a/e/p; */
/* move-object v4, v2 */
/* move-object v5, p1 */
/* move-wide v6, p3 */
/* invoke-direct/range {v4 ..v9}, Le/f/a/d/a/e/p;-><init>(Le/f/a/d/a/e/o;JJ)V */
(( e.f.a.d.a.e.o ) v2 ).l ( ); // invoke-virtual {v2}, Le/f/a/d/a/e/o;->l()Ljava/io/InputStream;
/* :try_end_0 */
/* .catch Ljava/io/EOFException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* if-lez v1, :cond_2 */
/* const/16 v3, 0x4000 */
try { // :try_start_1
v3 = java.lang.Math .min ( v1,v3 );
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
} // :goto_1
/* if-ge v5, v3, :cond_1 */
/* sub-int v6, v3, v5 */
v6 = (( java.io.InputStream ) v2 ).read ( p0, v5, v6 ); // invoke-virtual {v2, p0, v5, v6}, Ljava/io/InputStream;->read([BII)I
int v7 = -1; // const/4 v7, -0x1
/* if-eq v6, v7, :cond_0 */
/* add-int/2addr v5, v6 */
} // :cond_0
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "truncated input stream"; // const-string v1, "truncated input stream"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
/* move-object v5, p2 */
(( java.io.OutputStream ) p2 ).write ( p0, v4, v3 ); // invoke-virtual {p2, p0, v4, v3}, Ljava/io/OutputStream;->write([BII)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* sub-int/2addr v1, v3 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v1, v0 */
try { // :try_start_2
(( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* :catchall_1 */
/* move-exception v0 */
/* move-object v2, v0 */
try { // :try_start_3
e.f.a.d.a.e.w .a ( v1,v2 );
} // :goto_2
/* throw v1 */
} // :cond_2
(( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/io/EOFException; {:try_start_3 ..:try_end_3} :catch_0 */
return;
/* :catch_0 */
/* move-exception v0 */
/* new-instance v1, Ljava/io/IOException; */
final String v2 = "patch underrun"; // const-string v2, "patch underrun"
/* invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v1 */
} // :cond_3
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "Output length overrun"; // const-string v1, "Output length overrun"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_4
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "inputOffset negative"; // const-string v1, "inputOffset negative"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_5
/* new-instance v0, Ljava/io/IOException; */
final String v1 = "copyLength negative"; // const-string v1, "copyLength negative"
/* invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public static void a ( Object[] p0, java.io.DataInputStream p1, java.io.OutputStream p2, Integer p3, Long p4 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* if-ltz p3, :cond_2 */
/* int-to-long v0, p3 */
/* cmp-long v2, v0, p4 */
/* if-gtz v2, :cond_1 */
} // :goto_0
/* if-lez p3, :cond_0 */
/* const/16 p4, 0x4000 */
try { // :try_start_0
p4 = java.lang.Math .min ( p3,p4 );
int p5 = 0; // const/4 p5, 0x0
(( java.io.DataInputStream ) p1 ).readFully ( p0, p5, p4 ); // invoke-virtual {p1, p0, p5, p4}, Ljava/io/DataInputStream;->readFully([BII)V
(( java.io.OutputStream ) p2 ).write ( p0, p5, p4 ); // invoke-virtual {p2, p0, p5, p4}, Ljava/io/OutputStream;->write([BII)V
/* :try_end_0 */
/* .catch Ljava/io/EOFException; {:try_start_0 ..:try_end_0} :catch_0 */
/* sub-int/2addr p3, p4 */
/* :catch_0 */
/* new-instance p0, Ljava/io/IOException; */
final String p1 = "patch underrun"; // const-string p1, "patch underrun"
/* invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // :cond_0
return;
} // :cond_1
/* new-instance p0, Ljava/io/IOException; */
final String p1 = "Output length overrun"; // const-string p1, "Output length overrun"
/* invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // :cond_2
/* new-instance p0, Ljava/io/IOException; */
final String p1 = "copyLength negative"; // const-string p1, "copyLength negative"
/* invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void b ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Ljava/lang/Object;", */
/* ">(TT;)V" */
/* } */
} // .end annotation
if ( p0 != null) { // if-eqz p0, :cond_0
return;
} // :cond_0
/* new-instance p0, Ljava/lang/NullPointerException; */
final String v0 = "Cannot return null from a non-@Nullable @Provides method"; // const-string v0, "Cannot return null from a non-@Nullable @Provides method"
/* invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
