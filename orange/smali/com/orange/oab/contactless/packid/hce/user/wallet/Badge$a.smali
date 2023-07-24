.class public Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/oab/contactless/packid/hce/user/wallet/Badge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/orange/oab/contactless/packid/hce/user/TokenData;

.field public b:Lfr/mbs/binary/Octets;

.field public c:Lfr/mbs/binary/Octets;

.field public d:Ljava/util/Date;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
