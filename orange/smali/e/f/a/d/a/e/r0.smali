.class public final Le/f/a/d/a/e/r0;
.super Le/f/a/d/a/e/c0;
.source "SourceFile"

# interfaces
.implements Le/f/a/d/a/e/s0;


# direct methods
.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback"

    invoke-direct {p0, p1, v0}, Le/f/a/d/a/e/c0;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Le/f/a/d/a/e/c0;->e()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Le/f/a/d/a/e/e0;->a(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Le/f/a/d/a/e/e0;->a(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Le/f/a/d/a/e/c0;->a(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Le/f/a/d/a/e/c0;->e()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Le/f/a/d/a/e/e0;->a(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, Le/f/a/d/a/e/c0;->a(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final h(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    invoke-virtual {p0}, Le/f/a/d/a/e/c0;->e()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Le/f/a/d/a/e/e0;->a(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Le/f/a/d/a/e/c0;->a(ILandroid/os/Parcel;)V

    return-void
.end method
