.class public abstract Le/h/b/a/l/t0;
.super Lc/b/k/r;
.source "SourceFile"


# instance fields
.field public q:Landroid/widget/TextView;

.field public r:Landroid/widget/TextView;

.field public s:Le/h/b/a/m/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc/b/k/r;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    invoke-virtual {p1}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object p1

    iget-object v0, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    invoke-virtual {v0}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object v0

    invoke-static {p0, p1, v0, p2}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->saveAutorisedValue(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;Z)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lc/b/k/r;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Le/h/b/a/l/t0;->s()I

    move-result p1

    invoke-virtual {p0, p1}, Lc/b/k/r;->setContentView(I)V

    const p1, 0x7f08016b

    .line 3
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 4
    invoke-virtual {p0, p1}, Lc/b/k/r;->a(Landroidx/appcompat/widget/Toolbar;)V

    .line 5
    invoke-virtual {p0}, Lc/b/k/r;->p()Lc/b/k/a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lc/b/k/a;->d(Z)V

    const v0, 0x7f050026

    .line 6
    invoke-static {p0, v0}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    .line 7
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt p1, v1, :cond_0

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p0, v0}, Lc/h/f/f;->a(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_0
    const p1, 0x7f08017b

    .line 9
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Le/h/b/a/l/t0;->r:Landroid/widget/TextView;

    const p1, 0x7f080178

    .line 10
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Le/h/b/a/l/t0;->q:Landroid/widget/TextView;

    .line 11
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v0, "BADGE"

    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Le/h/b/a/m/d;

    iput-object p1, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    .line 13
    iget-object v0, p0, Le/h/b/a/l/t0;->q:Landroid/widget/TextView;

    invoke-virtual {p1}, Le/h/b/a/m/d;->f()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object p1, p0, Le/h/b/a/l/t0;->r:Landroid/widget/TextView;

    iget-object v0, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    invoke-virtual {v0}, Le/h/b/a/m/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    iget-object p1, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    invoke-virtual {p1}, Le/h/b/a/m/d;->t()Z

    move-result p1

    if-eqz p1, :cond_1

    const p1, 0x7f08017a

    .line 16
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 17
    iget-object v0, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    invoke-virtual {v0}, Le/h/b/a/m/d;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const p1, 0x7f080057

    .line 18
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 19
    iget-object v0, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    invoke-virtual {v0, p1}, Le/h/b/a/m/d;->d(Landroid/widget/ImageView;)V

    .line 20
    iget-object p1, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    const v0, 0x7f080179

    invoke-virtual {p0, v0}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Le/h/b/a/m/d;->a(Landroid/widget/TextView;)V

    .line 21
    :cond_2
    iget-object p1, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    invoke-virtual {p1}, Le/h/b/a/m/d;->y()Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x7f0800d9

    .line 22
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x0

    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const p1, 0x7f080148

    .line 24
    invoke-virtual {p0, p1}, Lc/b/k/r;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Switch;

    .line 25
    iget-object v0, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    invoke-virtual {v0}, Le/h/b/a/m/d;->d()Lfr/mbs/binary/Octets;

    move-result-object v0

    iget-object v1, p0, Le/h/b/a/l/t0;->s:Le/h/b/a/m/d;

    invoke-virtual {v1}, Le/h/b/a/m/d;->a()Lfr/mbs/binary/Octets;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/orange/oab/contactless/packid/service/ZoneDetectionNotification;->isAutorised(Landroid/content/Context;Lfr/mbs/binary/Octets;Lfr/mbs/binary/Octets;)Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/Switch;->setChecked(Z)V

    .line 26
    new-instance v0, Le/h/b/a/l/b;

    invoke-direct {v0, p0}, Le/h/b/a/l/b;-><init>(Le/h/b/a/l/t0;)V

    invoke-virtual {p1, v0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_3
    return-void
.end method

.method public onNavigateUp()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x1

    return v0
.end method

.method public abstract s()I
.end method
