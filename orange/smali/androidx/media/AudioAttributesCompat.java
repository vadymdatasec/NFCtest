public class androidx.media.AudioAttributesCompat implements c.x.b {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final android.util.SparseIntArray b;
	 /* # instance fields */
	 public androidx.media.AudioAttributesImpl a;
	 /* # direct methods */
	 public static androidx.media.AudioAttributesCompat ( ) {
		 /* .locals 4 */
		 /* .line 1 */
		 /* new-instance v0, Landroid/util/SparseIntArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V */
		 int v1 = 1; // const/4 v1, 0x1
		 int v2 = 5; // const/4 v2, 0x5
		 /* .line 2 */
		 (( android.util.SparseIntArray ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V
		 /* .line 3 */
		 v0 = androidx.media.AudioAttributesCompat.b;
		 int v2 = 2; // const/4 v2, 0x2
		 int v3 = 6; // const/4 v3, 0x6
		 (( android.util.SparseIntArray ) v0 ).put ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/util/SparseIntArray;->put(II)V
		 /* .line 4 */
		 v0 = androidx.media.AudioAttributesCompat.b;
		 int v3 = 7; // const/4 v3, 0x7
		 (( android.util.SparseIntArray ) v0 ).put ( v3, v2 ); // invoke-virtual {v0, v3, v2}, Landroid/util/SparseIntArray;->put(II)V
		 /* .line 5 */
		 v0 = androidx.media.AudioAttributesCompat.b;
		 /* const/16 v2, 0x8 */
		 (( android.util.SparseIntArray ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V
		 /* .line 6 */
		 v0 = androidx.media.AudioAttributesCompat.b;
		 /* const/16 v2, 0x9 */
		 (( android.util.SparseIntArray ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V
		 /* .line 7 */
		 v0 = androidx.media.AudioAttributesCompat.b;
		 /* const/16 v2, 0xa */
		 (( android.util.SparseIntArray ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/util/SparseIntArray;->put(II)V
		 return;
	 } // .end method
	 public androidx.media.AudioAttributesCompat ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer a ( Boolean p0, Integer p1, Integer p2 ) {
		 /* .locals 3 */
		 /* and-int/lit8 v0, p1, 0x1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* if-ne v0, v1, :cond_1 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
		 } // :cond_0
		 int v1 = 7; // const/4 v1, 0x7
	 } // :goto_0
} // :cond_1
int v0 = 4; // const/4 v0, 0x4
/* and-int/2addr p1, v0 */
int v2 = 0; // const/4 v2, 0x0
/* if-ne p1, v0, :cond_3 */
if ( p0 != null) { // if-eqz p0, :cond_2
} // :cond_2
int v2 = 6; // const/4 v2, 0x6
} // :goto_1
} // :cond_3
int p1 = 3; // const/4 p1, 0x3
/* packed-switch p2, :pswitch_data_0 */
/* :pswitch_0 */
/* if-nez p0, :cond_6 */
/* :pswitch_1 */
/* :pswitch_2 */
/* const/16 p0, 0xa */
/* :pswitch_3 */
int p0 = 2; // const/4 p0, 0x2
/* :pswitch_4 */
int p0 = 5; // const/4 p0, 0x5
/* :pswitch_5 */
/* :pswitch_6 */
if ( p0 != null) { // if-eqz p0, :cond_4
} // :cond_4
/* const/16 v2, 0x8 */
} // :goto_2
/* :pswitch_7 */
/* :pswitch_8 */
/* :pswitch_9 */
if ( p0 != null) { // if-eqz p0, :cond_5
/* const/high16 p1, -0x80000000 */
} // :cond_5
/* .line 2 */
} // :cond_6
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "Unknown usage value "; // const-string v0, "Unknown usage value "
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p2 = " in audio attributes"; // const-string p2, " in audio attributes"
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_9 */
/* :pswitch_8 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_4 */
/* :pswitch_4 */
/* :pswitch_4 */
/* :pswitch_2 */
/* :pswitch_8 */
/* :pswitch_1 */
/* :pswitch_8 */
/* :pswitch_0 */
/* :pswitch_8 */
} // .end packed-switch
} // .end method
public static java.lang.String a ( Integer p0 ) {
/* .locals 2 */
/* packed-switch p0, :pswitch_data_0 */
/* .line 1 */
/* :pswitch_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "unknown usage "; // const-string v1, "unknown usage "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :pswitch_1 */
final String p0 = "USAGE_ASSISTANT"; // const-string p0, "USAGE_ASSISTANT"
/* :pswitch_2 */
final String p0 = "USAGE_GAME"; // const-string p0, "USAGE_GAME"
/* :pswitch_3 */
final String p0 = "USAGE_ASSISTANCE_SONIFICATION"; // const-string p0, "USAGE_ASSISTANCE_SONIFICATION"
/* :pswitch_4 */
final String p0 = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE"; // const-string p0, "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE"
/* :pswitch_5 */
final String p0 = "USAGE_ASSISTANCE_ACCESSIBILITY"; // const-string p0, "USAGE_ASSISTANCE_ACCESSIBILITY"
/* :pswitch_6 */
final String p0 = "USAGE_NOTIFICATION_EVENT"; // const-string p0, "USAGE_NOTIFICATION_EVENT"
/* :pswitch_7 */
final String p0 = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED"; // const-string p0, "USAGE_NOTIFICATION_COMMUNICATION_DELAYED"
/* :pswitch_8 */
final String p0 = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT"; // const-string p0, "USAGE_NOTIFICATION_COMMUNICATION_INSTANT"
/* :pswitch_9 */
final String p0 = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST"; // const-string p0, "USAGE_NOTIFICATION_COMMUNICATION_REQUEST"
/* :pswitch_a */
final String p0 = "USAGE_NOTIFICATION_RINGTONE"; // const-string p0, "USAGE_NOTIFICATION_RINGTONE"
/* :pswitch_b */
final String p0 = "USAGE_NOTIFICATION"; // const-string p0, "USAGE_NOTIFICATION"
/* :pswitch_c */
final String p0 = "USAGE_ALARM"; // const-string p0, "USAGE_ALARM"
/* :pswitch_d */
final String p0 = "USAGE_VOICE_COMMUNICATION_SIGNALLING"; // const-string p0, "USAGE_VOICE_COMMUNICATION_SIGNALLING"
/* :pswitch_e */
final String p0 = "USAGE_VOICE_COMMUNICATION"; // const-string p0, "USAGE_VOICE_COMMUNICATION"
/* :pswitch_f */
final String p0 = "USAGE_MEDIA"; // const-string p0, "USAGE_MEDIA"
/* :pswitch_10 */
final String p0 = "USAGE_UNKNOWN"; // const-string p0, "USAGE_UNKNOWN"
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_10 */
/* :pswitch_f */
/* :pswitch_e */
/* :pswitch_d */
/* :pswitch_c */
/* :pswitch_b */
/* :pswitch_a */
/* :pswitch_9 */
/* :pswitch_8 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
/* # virtual methods */
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 2 */
/* .line 1 */
/* instance-of v0, p1, Landroidx/media/AudioAttributesCompat; */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* check-cast p1, Landroidx/media/AudioAttributesCompat; */
/* .line 3 */
v0 = this.a;
/* if-nez v0, :cond_2 */
/* .line 4 */
p1 = this.a;
/* if-nez p1, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
} // :cond_1
/* .line 5 */
} // :cond_2
p1 = this.a;
p1 = (( java.lang.Object ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
