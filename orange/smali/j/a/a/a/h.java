public abstract class j.a.a.a.h {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( ) {
		 /* .locals 5 */
		 /* .line 1 */
		 v0 = 		 android.hardware.Camera .getNumberOfCameras ( );
		 /* .line 2 */
		 /* new-instance v1, Landroid/hardware/Camera$CameraInfo; */
		 /* invoke-direct {v1}, Landroid/hardware/Camera$CameraInfo;-><init>()V */
		 int v2 = -1; // const/4 v2, -0x1
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = -1; // const/4 v3, -0x1
	 } // :goto_0
	 /* if-ge v2, v0, :cond_1 */
	 /* .line 3 */
	 android.hardware.Camera .getCameraInfo ( v2,v1 );
	 /* .line 4 */
	 /* iget v3, v1, Landroid/hardware/Camera$CameraInfo;->facing:I */
	 /* if-nez v3, :cond_0 */
} // :cond_0
/* add-int/lit8 v3, v2, 0x1 */
/* move v4, v3 */
/* move v3, v2 */
/* move v2, v4 */
} // :cond_1
} // .end method
public static android.hardware.Camera a ( Integer p0 ) {
/* .locals 1 */
int v0 = -1; // const/4 v0, -0x1
/* if-ne p0, v0, :cond_0 */
/* .line 5 */
try { // :try_start_0
android.hardware.Camera .open ( );
/* .line 6 */
} // :cond_0
android.hardware.Camera .open ( p0 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Boolean a ( android.hardware.Camera p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 7 */
(( android.hardware.Camera ) p0 ).getParameters ( ); // invoke-virtual {p0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
/* .line 8 */
(( android.hardware.Camera$Parameters ) p0 ).getFlashMode ( ); // invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getFlashMode()Ljava/lang/String;
/* if-nez v1, :cond_0 */
/* .line 9 */
} // :cond_0
(( android.hardware.Camera$Parameters ) p0 ).getSupportedFlashModes ( ); // invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;
if ( p0 != null) { // if-eqz p0, :cond_2
v1 = /* .line 10 */
v1 = /* if-nez v1, :cond_2 */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_1 */
/* check-cast p0, Ljava/lang/String; */
final String v1 = "off"; // const-string v1, "off"
p0 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p0 != null) { // if-eqz p0, :cond_1
} // :cond_1
} // :cond_2
} // :goto_0
} // .end method
