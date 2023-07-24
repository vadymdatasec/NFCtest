.class public final Lcom/orange/oab/contactless/packid/rssi/RssiLevel$b;
.super Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/oab/contactless/packid/rssi/RssiLevel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/orange/oab/contactless/packid/rssi/RssiLevel;-><init>(Ljava/lang/String;IIILi/h/c/g;)V

    return-void
.end method


# virtual methods
.method public getMaxLevel(I)F
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
