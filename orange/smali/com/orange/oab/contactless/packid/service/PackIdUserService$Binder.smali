.class public Lcom/orange/oab/contactless/packid/service/PackIdUserService$Binder;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/orange/oab/contactless/packid/service/PackIdUserService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Binder"
.end annotation


# instance fields
.field public final synthetic a:Lcom/orange/oab/contactless/packid/service/PackIdUserService;


# direct methods
.method public constructor <init>(Lcom/orange/oab/contactless/packid/service/PackIdUserService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/orange/oab/contactless/packid/service/PackIdUserService$Binder;->a:Lcom/orange/oab/contactless/packid/service/PackIdUserService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public getService()Lcom/orange/oab/contactless/packid/service/PackIdUserService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/orange/oab/contactless/packid/service/PackIdUserService$Binder;->a:Lcom/orange/oab/contactless/packid/service/PackIdUserService;

    return-object v0
.end method
