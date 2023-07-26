public abstract class com.google.android.gms.common.stats.StatsEvent extends e.f.a.b.c.m.j.a implements com.google.android.gms.common.internal.ReflectedParcelable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public com.google.android.gms.common.stats.StatsEvent ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Le/f/a/b/c/m/j/a;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract Integer a ( ) {
	 } // .end method
	 public abstract Long b ( ) {
	 } // .end method
	 public abstract Long c ( ) {
	 } // .end method
	 public abstract java.lang.String d ( ) {
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 8 */
		 /* .line 1 */
		 (( com.google.android.gms.common.stats.StatsEvent ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/google/android/gms/common/stats/StatsEvent;->b()J
		 /* move-result-wide v0 */
		 /* .line 2 */
		 v2 = 		 (( com.google.android.gms.common.stats.StatsEvent ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/android/gms/common/stats/StatsEvent;->a()I
		 /* .line 3 */
		 (( com.google.android.gms.common.stats.StatsEvent ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/google/android/gms/common/stats/StatsEvent;->c()J
		 /* move-result-wide v3 */
		 /* .line 4 */
		 (( com.google.android.gms.common.stats.StatsEvent ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/google/android/gms/common/stats/StatsEvent;->d()Ljava/lang/String;
		 java.lang.String .valueOf ( v5 );
		 v6 = 		 (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
		 /* add-int/lit8 v6, v6, 0x35 */
		 /* new-instance v7, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V */
		 (( java.lang.StringBuilder ) v7 ).append ( v0, v1 ); // invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
		 final String v0 = "\t"; // const-string v0, "\t"
		 (( java.lang.StringBuilder ) v7 ).append ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).append ( v2 ); // invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).append ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).append ( v3, v4 ); // invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).append ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
