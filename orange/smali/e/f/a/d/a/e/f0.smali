.class public final Le/f/a/d/a/e/f0;
.super Le/f/a/d/a/e/c0;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/h0;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.appupdate.protocol.IAppUpdateService"

    invoke-direct {p0, p1, v0}, Le/f/a/d/a/e/c0;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/os/Bundle;Le/f/a/d/a/e/j0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Le/f/a/d/a/e/c0;->e()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Le/f/a/d/a/e/e0;->a(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Le/f/a/d/a/e/e0;->a(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Le/f/a/d/a/e/c0;->a(ILandroid/os/Parcel;)V

    return-void
.end method
