.class public final synthetic Le/h/d/a/a/w/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Le/h/d/a/a/w/n;


# instance fields
.field private final synthetic a:Le/h/d/a/a/w/j;

.field private final synthetic b:Ljava/lang/String;

.field private final synthetic c:Landroid/content/Context;

.field private final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Le/h/d/a/a/w/j;Ljava/lang/String;Landroid/content/Context;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/d/a/a/w/a;->a:Le/h/d/a/a/w/j;

    iput-object p2, p0, Le/h/d/a/a/w/a;->b:Ljava/lang/String;

    iput-object p3, p0, Le/h/d/a/a/w/a;->c:Landroid/content/Context;

    iput-boolean p4, p0, Le/h/d/a/a/w/a;->d:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Le/h/d/a/a/w/a;->a:Le/h/d/a/a/w/j;

    iget-object v1, p0, Le/h/d/a/a/w/a;->b:Ljava/lang/String;

    iget-object v2, p0, Le/h/d/a/a/w/a;->c:Landroid/content/Context;

    iget-boolean v3, p0, Le/h/d/a/a/w/a;->d:Z

    invoke-static {v0, v1, v2, v3}, Lcom/orange/oab/contactless/packid/service/LogManager;->a(Le/h/d/a/a/w/j;Ljava/lang/String;Landroid/content/Context;Z)V

    return-void
.end method
