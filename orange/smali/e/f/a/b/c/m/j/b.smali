.class public abstract Le/f/a/b/c/m/j/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/os/Parcel;)I
    .locals 1

    const/16 v0, 0x4f45

    .line 1
    invoke-static {p0, v0}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;I)I

    move-result p0

    return p0
.end method

.method public static a(Landroid/os/Parcel;I)V
    .locals 0

    .line 2
    invoke-static {p0, p1}, Le/f/a/b/c/m/j/b;->c(Landroid/os/Parcel;I)V

    return-void
.end method

.method public static a(Landroid/os/Parcel;IF)V
    .locals 1

    const/4 v0, 0x4

    .line 9
    invoke-static {p0, p1, v0}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;II)V

    .line 10
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeFloat(F)V

    return-void
.end method

.method public static a(Landroid/os/Parcel;II)V
    .locals 1

    const/4 v0, 0x4

    .line 5
    invoke-static {p0, p1, v0}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;II)V

    .line 6
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public static a(Landroid/os/Parcel;IJ)V
    .locals 1

    const/16 v0, 0x8

    .line 7
    invoke-static {p0, p1, v0}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;II)V

    .line 8
    invoke-virtual {p0, p2, p3}, Landroid/os/Parcel;->writeLong(J)V

    return-void
.end method

.method public static a(Landroid/os/Parcel;ILandroid/os/Bundle;Z)V
    .locals 0

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 19
    invoke-static {p0, p1, p2}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;II)V

    :cond_0
    return-void

    .line 20
    :cond_1
    invoke-static {p0, p1}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;I)I

    move-result p1

    .line 21
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 22
    invoke-static {p0, p1}, Le/f/a/b/c/m/j/b;->c(Landroid/os/Parcel;I)V

    return-void
.end method

.method public static a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V
    .locals 0

    if-nez p2, :cond_1

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 15
    invoke-static {p0, p1, p2}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;II)V

    :cond_0
    return-void

    .line 16
    :cond_1
    invoke-static {p0, p1}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;I)I

    move-result p1

    .line 17
    invoke-interface {p2, p0, p3}, Landroid/os/Parcelable;->writeToParcel(Landroid/os/Parcel;I)V

    .line 18
    invoke-static {p0, p1}, Le/f/a/b/c/m/j/b;->c(Landroid/os/Parcel;I)V

    return-void
.end method

.method public static a(Landroid/os/Parcel;ILjava/lang/String;Z)V
    .locals 0

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 11
    invoke-static {p0, p1, p2}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;II)V

    :cond_0
    return-void

    .line 12
    :cond_1
    invoke-static {p0, p1}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;I)I

    move-result p1

    .line 13
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 14
    invoke-static {p0, p1}, Le/f/a/b/c/m/j/b;->c(Landroid/os/Parcel;I)V

    return-void
.end method

.method public static a(Landroid/os/Parcel;ILjava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    if-nez p2, :cond_1

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 23
    invoke-static {p0, p1, p2}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;II)V

    :cond_0
    return-void

    .line 24
    :cond_1
    invoke-static {p0, p1}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;I)I

    move-result p1

    .line 25
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 26
    invoke-static {p0, p1}, Le/f/a/b/c/m/j/b;->c(Landroid/os/Parcel;I)V

    return-void
.end method

.method public static a(Landroid/os/Parcel;IZ)V
    .locals 1

    const/4 v0, 0x4

    .line 3
    invoke-static {p0, p1, v0}, Le/f/a/b/c/m/j/b;->b(Landroid/os/Parcel;II)V

    .line 4
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public static b(Landroid/os/Parcel;I)I
    .locals 1

    const/high16 v0, -0x10000

    or-int/2addr p1, v0

    .line 4
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 6
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result p0

    return p0
.end method

.method public static b(Landroid/os/Parcel;II)V
    .locals 1

    const v0, 0xffff

    if-lt p2, v0, :cond_0

    const/high16 v0, -0x10000

    or-int/2addr p1, v0

    .line 1
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 2
    invoke-virtual {p0, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    shl-int/lit8 p2, p2, 0x10

    or-int/2addr p1, p2

    .line 3
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method

.method public static c(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/os/Parcel;->dataPosition()I

    move-result v0

    sub-int v1, v0, p1

    add-int/lit8 p1, p1, -0x4

    .line 2
    invoke-virtual {p0, p1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 3
    invoke-virtual {p0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 4
    invoke-virtual {p0, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    return-void
.end method
