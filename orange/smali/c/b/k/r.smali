.class public abstract Lc/b/k/r;
.super Lc/l/d/f0;
.source "SourceFile"

# interfaces
.implements Lc/b/k/s;
.implements Lc/h/e/j0;


# instance fields
.field public o:Lc/b/k/t;

.field public p:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/l/d/f0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/b/p/b;)Lc/b/p/c;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public a(Landroid/content/Intent;)V
    .locals 0

    .line 3
    invoke-static {p0, p1}, Lc/h/e/r;->a(Landroid/app/Activity;Landroid/content/Intent;)V

    return-void
.end method

.method public a(Landroidx/appcompat/widget/Toolbar;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroidx/appcompat/widget/Toolbar;)V

    return-void
.end method

.method public a(Lc/b/p/c;)V
    .locals 0

    return-void
.end method

.method public a(Lc/h/e/k0;)V
    .locals 0

    .line 2
    invoke-virtual {p1, p0}, Lc/h/e/k0;->a(Landroid/app/Activity;)Lc/h/e/k0;

    return-void
.end method

.method public final a(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1a

    if-ge p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result p1

    if-nez p1, :cond_0

    .line 5
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    move-result p1

    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result p1

    if-nez p1, :cond_0

    .line 6
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    if-nez p1, :cond_0

    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    invoke-static {p1}, Landroid/view/KeyEvent;->isModifierKey(I)Z

    move-result p1

    if-nez p1, :cond_0

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 9
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 11
    invoke-virtual {p1, p2}, Landroid/view/View;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/b/k/t;->a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroid/content/Context;)V

    return-void
.end method

.method public b(Lc/b/p/c;)V
    .locals 0

    return-void
.end method

.method public b(Lc/h/e/k0;)V
    .locals 0

    return-void
.end method

.method public b(Landroid/content/Intent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lc/h/e/r;->b(Landroid/app/Activity;Landroid/content/Intent;)Z

    move-result p1

    return p1
.end method

.method public closeOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lc/b/k/a;->e()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    :cond_1
    return-void
.end method

.method public d(I)V
    .locals 0

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;

    move-result-object v1

    const/16 v2, 0x52

    if-ne v0, v2, :cond_0

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1, p1}, Lc/b/k/a;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 4
    :cond_0
    invoke-super {p0, p1}, Lc/h/e/p;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public e()Landroid/content/Intent;
    .locals 1

    .line 1
    invoke-static {p0}, Lc/h/e/r;->a(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/k/t;->a(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/k/t;->b()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 2

    .line 1
    iget-object v0, p0, Lc/b/k/r;->p:Landroid/content/res/Resources;

    if-nez v0, :cond_0

    invoke-static {}, Lc/b/q/u2;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lc/b/q/u2;

    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lc/b/q/u2;-><init>(Landroid/content/Context;Landroid/content/res/Resources;)V

    iput-object v0, p0, Lc/b/k/r;->p:Landroid/content/res/Resources;

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/k/r;->p:Landroid/content/res/Resources;

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public invalidateOptionsMenu()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/k/t;->e()V

    return-void
.end method

.method public n()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/k/t;->e()V

    return-void
.end method

.method public o()Lc/b/k/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/k/r;->o:Lc/b/k/t;

    if-nez v0, :cond_0

    .line 2
    invoke-static {p0, p0}, Lc/b/k/t;->a(Landroid/app/Activity;Lc/b/k/s;)Lc/b/k/t;

    move-result-object v0

    iput-object v0, p0, Lc/b/k/r;->o:Lc/b/k/t;

    .line 3
    :cond_0
    iget-object v0, p0, Lc/b/k/r;->o:Lc/b/k/t;

    return-object v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lc/l/d/f0;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    iget-object v0, p0, Lc/b/k/r;->p:Landroid/content/res/Resources;

    if-eqz v0, :cond_0

    .line 3
    invoke-super {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lc/b/k/r;->p:Landroid/content/res/Resources;

    invoke-virtual {v1, p1, v0}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    .line 5
    :cond_0
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onContentChanged()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->q()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lc/b/k/t;->d()V

    .line 3
    invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroid/os/Bundle;)V

    .line 4
    invoke-super {p0, p1}, Lc/l/d/f0;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onDestroy()V

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/k/t;->f()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Lc/b/k/r;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lc/l/d/f0;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 2
    :cond_0
    invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;

    move-result-object p1

    .line 3
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v0, 0x102002c

    if-ne p2, v0, :cond_1

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Lc/b/k/a;->g()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p0}, Lc/b/k/r;->r()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lc/l/d/f0;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPostCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/k/t;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public onPostResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onPostResume()V

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/k/t;->g()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/k/t;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onStart()V

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/k/t;->h()V

    return-void
.end method

.method public onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Lc/l/d/f0;->onStop()V

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/k/t;->i()V

    return-void
.end method

.method public onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object p2

    invoke-virtual {p2, p1}, Lc/b/k/t;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public openOptionsMenu()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;

    move-result-object v0

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lc/b/k/a;->k()Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    :cond_1
    return-void
.end method

.method public p()Lc/b/k/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/k/t;->c()Lc/b/k/a;

    move-result-object v0

    return-object v0
.end method

.method public q()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public r()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->e()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p0, v0}, Lc/b/k/r;->b(Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {p0}, Lc/h/e/k0;->a(Landroid/content/Context;)Lc/h/e/k0;

    move-result-object v0

    .line 4
    invoke-virtual {p0, v0}, Lc/b/k/r;->a(Lc/h/e/k0;)V

    .line 5
    invoke-virtual {p0, v0}, Lc/b/k/r;->b(Lc/h/e/k0;)V

    .line 6
    invoke-virtual {v0}, Lc/h/e/k0;->a()V

    .line 7
    :try_start_0
    invoke-static {p0}, Lc/h/e/f;->a(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 8
    :catch_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0, v0}, Lc/b/k/r;->a(Landroid/content/Intent;)V

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/k/t;->c(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/k/t;->a(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lc/b/k/t;->b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setTheme(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->setTheme(I)V

    .line 2
    invoke-virtual {p0}, Lc/b/k/r;->o()Lc/b/k/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc/b/k/t;->d(I)V

    return-void
.end method
