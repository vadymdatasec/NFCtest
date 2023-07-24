.class public final synthetic Le/h/d/a/a/w/c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Le/h/d/a/a/w/n;


# instance fields
.field private final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/d/a/a/w/c;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Le/h/d/a/a/w/c;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/orange/oab/contactless/packid/service/LogManager;->b(Landroid/content/Context;)V

    return-void
.end method
