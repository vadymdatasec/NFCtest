.class public Lb/a/a/b/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb/a/a/b/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Landroid/os/Handler;

.field public c:Lb/a/a/b/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lb/a/a/b/d;

    invoke-direct {v0}, Lb/a/a/b/d;-><init>()V

    sput-object v0, Lb/a/a/b/g;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lb/a/a/b/g;->b:Landroid/os/Handler;

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lb/a/a/b/b;->a(Landroid/os/IBinder;)Lb/a/a/b/c;

    move-result-object p1

    iput-object p1, p0, Lb/a/a/b/g;->c:Lb/a/a/b/c;

    return-void
.end method


# virtual methods
.method public a(ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object p2, p0, Lb/a/a/b/g;->c:Lb/a/a/b/c;

    if-nez p2, :cond_0

    .line 3
    new-instance p2, Lb/a/a/b/e;

    invoke-direct {p2, p0}, Lb/a/a/b/e;-><init>(Lb/a/a/b/g;)V

    iput-object p2, p0, Lb/a/a/b/g;->c:Lb/a/a/b/c;

    .line 4
    :cond_0
    iget-object p2, p0, Lb/a/a/b/g;->c:Lb/a/a/b/c;

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
