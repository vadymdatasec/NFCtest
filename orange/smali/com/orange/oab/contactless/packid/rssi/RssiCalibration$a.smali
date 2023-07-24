.class public Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/oab/contactless/packid/rssi/RssiCalibration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:B

.field public b:Ljava/util/Date;


# direct methods
.method public constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-byte p1, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->a:B

    .line 3
    invoke-static {}, Le/h/d/a/a/n/t;->b()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lcom/orange/oab/contactless/packid/rssi/RssiCalibration$a;->b:Ljava/util/Date;

    return-void
.end method
