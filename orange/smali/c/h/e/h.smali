.class public Lc/h/e/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/app/Application;

.field public final synthetic c:Lc/h/e/j;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lc/h/e/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/h/e/h;->b:Landroid/app/Application;

    iput-object p2, p0, Lc/h/e/h;->c:Lc/h/e/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/h/e/h;->b:Landroid/app/Application;

    iget-object v1, p0, Lc/h/e/h;->c:Lc/h/e/j;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
