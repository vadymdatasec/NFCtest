.class public final synthetic Le/h/b/a/l/q;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic b:Le/h/b/a/l/y0;

.field private final synthetic c:Landroid/os/Vibrator;

.field private final synthetic d:Le/h/b/a/m/d;


# direct methods
.method public synthetic constructor <init>(Le/h/b/a/l/y0;Landroid/os/Vibrator;Le/h/b/a/m/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/q;->b:Le/h/b/a/l/y0;

    iput-object p2, p0, Le/h/b/a/l/q;->c:Landroid/os/Vibrator;

    iput-object p3, p0, Le/h/b/a/l/q;->d:Le/h/b/a/m/d;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Le/h/b/a/l/q;->b:Le/h/b/a/l/y0;

    iget-object v1, p0, Le/h/b/a/l/q;->c:Landroid/os/Vibrator;

    iget-object v2, p0, Le/h/b/a/l/q;->d:Le/h/b/a/m/d;

    invoke-virtual {v0, v1, v2, p1}, Le/h/b/a/l/y0;->a(Landroid/os/Vibrator;Le/h/b/a/m/d;Landroid/view/View;)V

    return-void
.end method
