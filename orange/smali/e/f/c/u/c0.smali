.class public Le/f/c/u/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Le/f/c/u/b0;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Le/f/c/u/b0;Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Le/f/a/b/c/m/j/b;->a(Landroid/os/Parcel;)I

    move-result p2

    .line 2
    iget-object p0, p0, Le/f/c/u/b0;->b:Landroid/os/Bundle;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, p0, v1}, Le/f/a/b/c/m/j/b;->a(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V

    .line 3
    invoke-static {p1, p2}, Le/f/a/b/c/m/j/b;->a(Landroid/os/Parcel;I)V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Le/f/c/u/b0;
    .locals 5

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->b(Landroid/os/Parcel;)I

    move-result v0

    const/4 v1, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    move-result v2

    if-ge v2, v0, :cond_1

    .line 3
    invoke-static {p1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->a(Landroid/os/Parcel;)I

    move-result v2

    .line 4
    invoke-static {v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->a(I)I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    .line 5
    invoke-static {p1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->j(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->a(Landroid/os/Parcel;I)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->d(Landroid/os/Parcel;I)V

    .line 8
    new-instance p1, Le/f/c/u/b0;

    invoke-direct {p1, v1}, Le/f/c/u/b0;-><init>(Landroid/os/Bundle;)V

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Le/f/c/u/c0;->createFromParcel(Landroid/os/Parcel;)Le/f/c/u/b0;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Le/f/c/u/b0;
    .locals 0

    .line 1
    new-array p1, p1, [Le/f/c/u/b0;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Le/f/c/u/c0;->newArray(I)[Le/f/c/u/b0;

    move-result-object p1

    return-object p1
.end method
