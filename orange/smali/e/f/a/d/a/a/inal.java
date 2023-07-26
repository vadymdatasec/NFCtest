public class inal extends e.f.a.d.a.a.a {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final java.lang.String a;
	 public final Integer b;
	 public final Integer c;
	 public final Integer d;
	 public final java.lang.Integer e;
	 public final Integer f;
	 public final Long g;
	 public final Long h;
	 public final Long i;
	 public final Long j;
	 public final android.app.PendingIntent k;
	 public final android.app.PendingIntent l;
	 public final android.app.PendingIntent m;
	 public final android.app.PendingIntent n;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 3 */
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* invoke-direct {p0}, Le/f/a/d/a/a/a;-><init>()V */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 this.a = v1;
			 /* move v1, p2 */
			 /* iput v1, v0, Le/f/a/d/a/a/s;->b:I */
			 /* move v1, p3 */
			 /* iput v1, v0, Le/f/a/d/a/a/s;->c:I */
			 /* move v1, p4 */
			 /* iput v1, v0, Le/f/a/d/a/a/s;->d:I */
			 /* move-object v1, p5 */
			 this.e = v1;
			 /* move v1, p6 */
			 /* iput v1, v0, Le/f/a/d/a/a/s;->f:I */
			 /* move-wide v1, p7 */
			 /* iput-wide v1, v0, Le/f/a/d/a/a/s;->g:J */
			 /* move-wide v1, p9 */
			 /* iput-wide v1, v0, Le/f/a/d/a/a/s;->h:J */
			 /* move-wide v1, p11 */
			 /* iput-wide v1, v0, Le/f/a/d/a/a/s;->i:J */
			 /* move-wide/from16 v1, p13 */
			 /* iput-wide v1, v0, Le/f/a/d/a/a/s;->j:J */
			 /* move-object/from16 v1, p15 */
			 this.k = v1;
			 /* move-object/from16 v1, p16 */
			 this.l = v1;
			 /* move-object/from16 v1, p17 */
			 this.m = v1;
			 /* move-object/from16 v1, p18 */
			 this.n = v1;
			 return;
		 } // :cond_0
		 /* new-instance v1, Ljava/lang/NullPointerException; */
		 final String v2 = "Null packageName"; // const-string v2, "Null packageName"
		 /* invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V */
		 /* throw v1 */
	 } // .end method
	 /* # virtual methods */
	 public final Integer a ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Le/f/a/d/a/a/s;->b:I */
	 } // .end method
	 public final Long b ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Le/f/a/d/a/a/s;->i:J */
		 /* return-wide v0 */
	 } // .end method
	 public final Long c ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Le/f/a/d/a/a/s;->g:J */
		 /* return-wide v0 */
	 } // .end method
	 public final Long d ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Le/f/a/d/a/a/s;->j:J */
		 /* return-wide v0 */
	 } // .end method
	 public final java.lang.Integer e ( ) {
		 /* .locals 1 */
		 v0 = this.e;
	 } // .end method
	 public final Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 7 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-ne p1, p0, :cond_0 */
	 } // :cond_0
	 /* instance-of v1, p1, Le/f/a/d/a/a/a; */
	 int v2 = 0; // const/4 v2, 0x0
	 if ( v1 != null) { // if-eqz v1, :cond_7
		 /* check-cast p1, Le/f/a/d/a/a/a; */
		 v1 = this.a;
		 (( e.f.a.d.a.a.a ) p1 ).k ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->k()Ljava/lang/String;
		 v1 = 		 (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_7
			 /* iget v1, p0, Le/f/a/d/a/a/s;->b:I */
			 v3 = 			 (( e.f.a.d.a.a.a ) p1 ).a ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->a()I
			 /* if-ne v1, v3, :cond_7 */
			 /* iget v1, p0, Le/f/a/d/a/a/s;->c:I */
			 v3 = 			 (( e.f.a.d.a.a.a ) p1 ).m ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->m()I
			 /* if-ne v1, v3, :cond_7 */
			 /* iget v1, p0, Le/f/a/d/a/a/s;->d:I */
			 v3 = 			 (( e.f.a.d.a.a.a ) p1 ).j ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->j()I
			 /* if-ne v1, v3, :cond_7 */
			 v1 = this.e;
			 /* if-nez v1, :cond_1 */
			 (( e.f.a.d.a.a.a ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->e()Ljava/lang/Integer;
			 /* if-nez v1, :cond_7 */
		 } // :cond_1
		 (( e.f.a.d.a.a.a ) p1 ).e ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->e()Ljava/lang/Integer;
		 v1 = 		 (( java.lang.Integer ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_7
		 } // :goto_0
		 /* iget v1, p0, Le/f/a/d/a/a/s;->f:I */
		 v3 = 		 (( e.f.a.d.a.a.a ) p1 ).n ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->n()I
		 /* if-ne v1, v3, :cond_7 */
		 /* iget-wide v3, p0, Le/f/a/d/a/a/s;->g:J */
		 (( e.f.a.d.a.a.a ) p1 ).c ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->c()J
		 /* move-result-wide v5 */
		 /* cmp-long v1, v3, v5 */
		 /* if-nez v1, :cond_7 */
		 /* iget-wide v3, p0, Le/f/a/d/a/a/s;->h:J */
		 (( e.f.a.d.a.a.a ) p1 ).l ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->l()J
		 /* move-result-wide v5 */
		 /* cmp-long v1, v3, v5 */
		 /* if-nez v1, :cond_7 */
		 /* iget-wide v3, p0, Le/f/a/d/a/a/s;->i:J */
		 (( e.f.a.d.a.a.a ) p1 ).b ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->b()J
		 /* move-result-wide v5 */
		 /* cmp-long v1, v3, v5 */
		 /* if-nez v1, :cond_7 */
		 /* iget-wide v3, p0, Le/f/a/d/a/a/s;->j:J */
		 (( e.f.a.d.a.a.a ) p1 ).d ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->d()J
		 /* move-result-wide v5 */
		 /* cmp-long v1, v3, v5 */
		 /* if-nez v1, :cond_7 */
		 v1 = this.k;
		 /* if-nez v1, :cond_2 */
		 (( e.f.a.d.a.a.a ) p1 ).f ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->f()Landroid/app/PendingIntent;
		 /* if-nez v1, :cond_7 */
	 } // :cond_2
	 (( e.f.a.d.a.a.a ) p1 ).f ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->f()Landroid/app/PendingIntent;
	 v1 = 	 (( android.app.PendingIntent ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Landroid/app/PendingIntent;->equals(Ljava/lang/Object;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_7
	 } // :goto_1
	 v1 = this.l;
	 /* if-nez v1, :cond_3 */
	 (( e.f.a.d.a.a.a ) p1 ).g ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->g()Landroid/app/PendingIntent;
	 /* if-nez v1, :cond_7 */
} // :cond_3
(( e.f.a.d.a.a.a ) p1 ).g ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->g()Landroid/app/PendingIntent;
v1 = (( android.app.PendingIntent ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Landroid/app/PendingIntent;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
} // :goto_2
v1 = this.m;
/* if-nez v1, :cond_4 */
(( e.f.a.d.a.a.a ) p1 ).h ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->h()Landroid/app/PendingIntent;
/* if-nez v1, :cond_7 */
} // :cond_4
(( e.f.a.d.a.a.a ) p1 ).h ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->h()Landroid/app/PendingIntent;
v1 = (( android.app.PendingIntent ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Landroid/app/PendingIntent;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_7
} // :goto_3
v1 = this.n;
(( e.f.a.d.a.a.a ) p1 ).i ( ); // invoke-virtual {p1}, Le/f/a/d/a/a/a;->i()Landroid/app/PendingIntent;
/* if-nez v1, :cond_5 */
/* if-nez p1, :cond_7 */
} // :cond_5
p1 = (( android.app.PendingIntent ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Landroid/app/PendingIntent;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_6 */
} // :cond_6
} // :goto_4
} // :cond_7
} // :goto_5
} // .end method
public final android.app.PendingIntent f ( ) {
/* .locals 1 */
v0 = this.k;
} // .end method
public final android.app.PendingIntent g ( ) {
/* .locals 1 */
v0 = this.l;
} // .end method
public final android.app.PendingIntent h ( ) {
/* .locals 1 */
v0 = this.m;
} // .end method
public final Integer hashCode ( ) {
/* .locals 15 */
v0 = this.a;
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
/* const v1, 0xf4243 */
/* xor-int/2addr v0, v1 */
/* mul-int v0, v0, v1 */
/* iget v2, p0, Le/f/a/d/a/a/s;->b:I */
/* xor-int/2addr v0, v2 */
/* mul-int v0, v0, v1 */
/* iget v2, p0, Le/f/a/d/a/a/s;->c:I */
/* xor-int/2addr v0, v2 */
/* mul-int v0, v0, v1 */
/* iget v2, p0, Le/f/a/d/a/a/s;->d:I */
/* xor-int/2addr v0, v2 */
/* mul-int v0, v0, v1 */
v2 = this.e;
int v3 = 0; // const/4 v3, 0x0
/* if-nez v2, :cond_0 */
int v2 = 0; // const/4 v2, 0x0
} // :cond_0
v2 = (( java.lang.Integer ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->hashCode()I
} // :goto_0
/* iget v4, p0, Le/f/a/d/a/a/s;->f:I */
/* iget-wide v5, p0, Le/f/a/d/a/a/s;->g:J */
/* iget-wide v7, p0, Le/f/a/d/a/a/s;->h:J */
/* iget-wide v9, p0, Le/f/a/d/a/a/s;->i:J */
/* iget-wide v11, p0, Le/f/a/d/a/a/s;->j:J */
/* xor-int/2addr v0, v2 */
/* mul-int v0, v0, v1 */
/* xor-int/2addr v0, v4 */
/* mul-int v0, v0, v1 */
/* const/16 v2, 0x20 */
/* ushr-long v13, v5, v2 */
/* xor-long v4, v13, v5 */
/* long-to-int v5, v4 */
/* xor-int/2addr v0, v5 */
/* mul-int v0, v0, v1 */
/* ushr-long v4, v7, v2 */
/* xor-long/2addr v4, v7 */
/* long-to-int v5, v4 */
/* xor-int/2addr v0, v5 */
/* mul-int v0, v0, v1 */
/* ushr-long v4, v9, v2 */
/* xor-long/2addr v4, v9 */
/* long-to-int v5, v4 */
/* xor-int/2addr v0, v5 */
/* mul-int v0, v0, v1 */
/* ushr-long v4, v11, v2 */
/* xor-long/2addr v4, v11 */
/* long-to-int v2, v4 */
/* xor-int/2addr v0, v2 */
/* mul-int v0, v0, v1 */
v2 = this.k;
/* if-nez v2, :cond_1 */
int v2 = 0; // const/4 v2, 0x0
} // :cond_1
v2 = (( android.app.PendingIntent ) v2 ).hashCode ( ); // invoke-virtual {v2}, Landroid/app/PendingIntent;->hashCode()I
} // :goto_1
/* xor-int/2addr v0, v2 */
/* mul-int v0, v0, v1 */
v2 = this.l;
/* if-nez v2, :cond_2 */
int v2 = 0; // const/4 v2, 0x0
} // :cond_2
v2 = (( android.app.PendingIntent ) v2 ).hashCode ( ); // invoke-virtual {v2}, Landroid/app/PendingIntent;->hashCode()I
} // :goto_2
/* xor-int/2addr v0, v2 */
/* mul-int v0, v0, v1 */
v2 = this.m;
/* if-nez v2, :cond_3 */
int v2 = 0; // const/4 v2, 0x0
} // :cond_3
v2 = (( android.app.PendingIntent ) v2 ).hashCode ( ); // invoke-virtual {v2}, Landroid/app/PendingIntent;->hashCode()I
} // :goto_3
/* xor-int/2addr v0, v2 */
/* mul-int v0, v0, v1 */
v1 = this.n;
/* if-nez v1, :cond_4 */
} // :cond_4
v3 = (( android.app.PendingIntent ) v1 ).hashCode ( ); // invoke-virtual {v1}, Landroid/app/PendingIntent;->hashCode()I
} // :goto_4
/* xor-int/2addr v0, v3 */
} // .end method
public final android.app.PendingIntent i ( ) {
/* .locals 1 */
v0 = this.n;
} // .end method
public final Integer j ( ) {
/* .locals 1 */
/* iget v0, p0, Le/f/a/d/a/a/s;->d:I */
} // .end method
public final java.lang.String k ( ) {
/* .locals 1 */
v0 = this.a;
} // .end method
public final Long l ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Le/f/a/d/a/a/s;->h:J */
/* return-wide v0 */
} // .end method
public final Integer m ( ) {
/* .locals 1 */
/* iget v0, p0, Le/f/a/d/a/a/s;->c:I */
} // .end method
public final Integer n ( ) {
/* .locals 1 */
/* iget v0, p0, Le/f/a/d/a/a/s;->f:I */
} // .end method
public final java.lang.String toString ( ) {
/* .locals 25 */
/* move-object/from16 v0, p0 */
v1 = this.a;
/* iget v2, v0, Le/f/a/d/a/a/s;->b:I */
/* iget v3, v0, Le/f/a/d/a/a/s;->c:I */
/* iget v4, v0, Le/f/a/d/a/a/s;->d:I */
v5 = this.e;
java.lang.String .valueOf ( v5 );
/* iget v6, v0, Le/f/a/d/a/a/s;->f:I */
/* iget-wide v7, v0, Le/f/a/d/a/a/s;->g:J */
/* iget-wide v9, v0, Le/f/a/d/a/a/s;->h:J */
/* iget-wide v11, v0, Le/f/a/d/a/a/s;->i:J */
/* iget-wide v13, v0, Le/f/a/d/a/a/s;->j:J */
v15 = this.k;
java.lang.String .valueOf ( v15 );
/* move-wide/from16 v16, v13 */
v13 = this.l;
java.lang.String .valueOf ( v13 );
v14 = this.m;
java.lang.String .valueOf ( v14 );
/* move-wide/from16 v18, v11 */
v11 = this.n;
java.lang.String .valueOf ( v11 );
v12 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
java.lang.String .valueOf ( v5 );
v20 = /* invoke-virtual/range {v20 ..v20}, Ljava/lang/String;->length()I */
java.lang.String .valueOf ( v15 );
v21 = /* invoke-virtual/range {v21 ..v21}, Ljava/lang/String;->length()I */
java.lang.String .valueOf ( v13 );
v22 = /* invoke-virtual/range {v22 ..v22}, Ljava/lang/String;->length()I */
java.lang.String .valueOf ( v14 );
v23 = /* invoke-virtual/range {v23 ..v23}, Ljava/lang/String;->length()I */
java.lang.String .valueOf ( v11 );
v24 = /* invoke-virtual/range {v24 ..v24}, Ljava/lang/String;->length()I */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* add-int/lit16 v12, v12, 0x1cf */
/* add-int v12, v12, v20 */
/* add-int v12, v12, v21 */
/* add-int v12, v12, v22 */
/* add-int v12, v12, v23 */
/* add-int v12, v12, v24 */
/* invoke-direct {v0, v12}, Ljava/lang/StringBuilder;-><init>(I)V */
final String v12 = "AppUpdateInfo{packageName="; // const-string v12, "AppUpdateInfo{packageName="
(( java.lang.StringBuilder ) v0 ).append ( v12 ); // invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", availableVersionCode="; // const-string v1, ", availableVersionCode="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", updateAvailability="; // const-string v1, ", updateAvailability="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", installStatus="; // const-string v1, ", installStatus="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", clientVersionStalenessDays="; // const-string v1, ", clientVersionStalenessDays="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", updatePriority="; // const-string v1, ", updatePriority="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ", bytesDownloaded="; // const-string v1, ", bytesDownloaded="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v7, v8 ); // invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = ", totalBytesToDownload="; // const-string v1, ", totalBytesToDownload="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v9, v10 ); // invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = ", additionalSpaceRequired="; // const-string v1, ", additionalSpaceRequired="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-wide/from16 v1, v18 */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = ", assetPackStorageSize="; // const-string v1, ", assetPackStorageSize="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-wide/from16 v1, v16 */
(( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = ", immediateUpdateIntent="; // const-string v1, ", immediateUpdateIntent="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v15 ); // invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", flexibleUpdateIntent="; // const-string v1, ", flexibleUpdateIntent="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v13 ); // invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", immediateDestructiveUpdateIntent="; // const-string v1, ", immediateDestructiveUpdateIntent="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v14 ); // invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", flexibleDestructiveUpdateIntent="; // const-string v1, ", flexibleDestructiveUpdateIntent="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "}"; // const-string v1, "}"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
