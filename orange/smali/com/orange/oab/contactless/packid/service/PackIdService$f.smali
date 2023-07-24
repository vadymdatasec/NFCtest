.class public Lcom/orange/oab/contactless/packid/service/PackIdService$f;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/oab/contactless/packid/service/PackIdService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Lcom/orange/oab/contactless/packid/service/PackIdService;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService$f;->a:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/orange/oab/contactless/packid/service/PackIdService;Lcom/orange/oab/contactless/packid/service/PackIdService$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/orange/oab/contactless/packid/service/PackIdService$f;-><init>(Lcom/orange/oab/contactless/packid/service/PackIdService;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdService$f;->a:Lcom/orange/oab/contactless/packid/service/PackIdService;

    monitor-enter p1

    .line 2
    :try_start_0
    iget-object p2, p0, Lcom/orange/oab/contactless/packid/service/PackIdService$f;->a:Lcom/orange/oab/contactless/packid/service/PackIdService;

    invoke-static {p2}, Lcom/orange/oab/contactless/packid/service/PackIdService;->c(Lcom/orange/oab/contactless/packid/service/PackIdService;)V

    .line 3
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
