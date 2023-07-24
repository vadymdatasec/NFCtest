.class public final Lm/a/b/j/b/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljavax/swing/JComponent;


# direct methods
.method public constructor <init>(Ljavax/swing/JComponent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/a/b/j/b/a;->b:Ljavax/swing/JComponent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm/a/b/j/b/a;->b:Ljavax/swing/JComponent;

    invoke-virtual {v0}, Ljavax/swing/JComponent;->repaint()V

    return-void
.end method
