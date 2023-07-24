.class public final synthetic Le/h/d/a/a/g/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Le/h/d/a/a/g/f;

.field private final synthetic c:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Le/h/d/a/a/g/f;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/d/a/a/g/a;->b:Le/h/d/a/a/g/f;

    iput-object p2, p0, Le/h/d/a/a/g/a;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le/h/d/a/a/g/a;->b:Le/h/d/a/a/g/f;

    iget-object v1, p0, Le/h/d/a/a/g/a;->c:Landroid/content/Context;

    invoke-static {v0, v1}, Le/h/d/a/a/g/f;->a(Le/h/d/a/a/g/f;Landroid/content/Context;)V

    return-void
.end method
