.class public Lcom/orange/oab/contactless/packid/service/PackIdService$e;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/orange/oab/contactless/packid/service/PackIdService;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/orange/oab/contactless/packid/service/PackIdService;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService$e;->b:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdService$e;->b:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-static {v0}, Lcom/orange/oab/contactless/packid/service/PackIdService;->b(Lcom/orange/oab/contactless/packid/service/PackIdService;)Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;

    move-result-object v0

    invoke-virtual {v0}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->b()V

    return-void
.end method
