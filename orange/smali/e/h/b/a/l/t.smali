.class public final synthetic Le/h/b/a/l/t;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic b:Le/h/b/a/l/y0;

.field private final synthetic c:Le/h/b/a/m/d;

.field private final synthetic d:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Le/h/b/a/l/y0;Le/h/b/a/m/d;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/t;->b:Le/h/b/a/l/y0;

    iput-object p2, p0, Le/h/b/a/l/t;->c:Le/h/b/a/m/d;

    iput-object p3, p0, Le/h/b/a/l/t;->d:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Le/h/b/a/l/t;->b:Le/h/b/a/l/y0;

    iget-object v1, p0, Le/h/b/a/l/t;->c:Le/h/b/a/m/d;

    iget-object v2, p0, Le/h/b/a/l/t;->d:Landroid/view/View;

    invoke-virtual {v0, v1, v2, p1}, Le/h/b/a/l/y0;->a(Le/h/b/a/m/d;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
