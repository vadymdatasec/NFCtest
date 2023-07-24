.class public final synthetic Le/h/d/a/a/w/b;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/orange/oab/contactless/packid/service/PackIdApduService;


# direct methods
.method public synthetic constructor <init>(Lcom/orange/oab/contactless/packid/service/PackIdApduService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/d/a/a/w/b;->b:Lcom/orange/oab/contactless/packid/service/PackIdApduService;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/h/d/a/a/w/b;->b:Lcom/orange/oab/contactless/packid/service/PackIdApduService;

    invoke-static {v0}, Lcom/orange/oab/contactless/packid/service/PackIdApduService;->a(Lcom/orange/oab/contactless/packid/service/PackIdApduService;)V

    return-void
.end method
